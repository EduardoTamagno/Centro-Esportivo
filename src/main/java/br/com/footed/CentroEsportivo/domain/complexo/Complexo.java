package br.com.footed.CentroEsportivo.domain.complexo;

import br.com.footed.CentroEsportivo.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="complexo")
public class Complexo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complexo_sequence")
    @SequenceGenerator(name = "complexo_sequence", sequenceName = "complexo_sequence", allocationSize = 1)
    private int complexo_Id;
    private String nome;
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Complexo(DadosCadastroComplexo dados) {
        this.nome = dados.nome();
        this.cnpj = dados.cnpj();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoComplexo dados) {
        if(dados.nome() != null) this.nome = dados.nome();
        if (dados.endereco() != null) this.endereco.atualizarInformacoes(dados.endereco());
    }
}
