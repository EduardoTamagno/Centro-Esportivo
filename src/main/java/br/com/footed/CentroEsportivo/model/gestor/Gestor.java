package br.com.footed.CentroEsportivo.model.gestor;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;
import br.com.footed.CentroEsportivo.model.complexo.DadosCadastroComplexo;
import br.com.footed.CentroEsportivo.model.pessoa.DadosCadastroPessoa;
import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "gestor")
public class Gestor implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gestor_id;
    private String cnpj;
    private String senha;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "pessoa_id")
    private Pessoa pessoa;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "complexo_id")
    private Complexo complexo;

    public Gestor(String cnpj, String senha, DadosCadastroComplexo dadosComplexo, DadosCadastroPessoa dadosPessoa) {
        this.cnpj = cnpj;
        this.senha = senha;
        this.complexo = new Complexo(dadosComplexo);
        this.pessoa = new Pessoa(dadosPessoa);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return getSenha();
    }

    @Override
    public String getUsername() {
        return getCnpj();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
