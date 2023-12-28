package br.com.footed.CentroEsportivo.model.Modalidade;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "modalidade")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modalidade_id")
    private Integer modalidadeId;
    private String nome;
    private String descricao;

    public Modalidade(DadosCadastroModalidade dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
    }
}
