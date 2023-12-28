package br.com.footed.CentroEsportivo.model.complexo;


import br.com.footed.CentroEsportivo.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="complexo")
public class Complexo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complexo_id")
    private int complexoId;
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Complexo(DadosCadastroComplexo dados) {
        this.nome = dados.nome();
        this.endereco = new Endereco(dados.endereco());
    }
}
