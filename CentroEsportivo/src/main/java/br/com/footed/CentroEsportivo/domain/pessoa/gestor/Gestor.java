package br.com.footed.CentroEsportivo.domain.pessoa.gestor;

import br.com.footed.CentroEsportivo.domain.endereco.Endereco;
import br.com.footed.CentroEsportivo.domain.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    @SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", allocationSize = 1)
    private int gestor_Id;
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Gestor(DadosCadastroGestor dados) {
        this.cnpj = dados.cnpj();
        this.pessoa = new Pessoa(dados.pessoa());
        this.endereco =  new Endereco(dados.endereco());
    }
}
