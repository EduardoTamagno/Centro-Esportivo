package br.com.footed.CentroEsportivo.domain.pessoa.usuario;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import br.com.footed.CentroEsportivo.domain.pessoa.DadosCadastroPessoa;
import br.com.footed.CentroEsportivo.domain.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    @SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", allocationSize = 1)
    private int usuario_Id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Usuario(DadosCadastroPessoa dados) {
        this.pessoa = new Pessoa(dados);
    }
}
