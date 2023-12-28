package br.com.footed.CentroEsportivo.model.quadra;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalTime;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "quadra")
public class  Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quadra_id")
    private Integer quadraId;

    private String nome;

    private BigDecimal preco;

    private String descricao;

    private LocalTime inicio_funcionamento;

    private LocalTime fim_funcionamento;

    @OneToOne
    @JoinColumn(name = "complexo_id")
    private Complexo complexo;

    public Quadra(DadosCadastroQuadra dados, Complexo complexo) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.inicio_funcionamento = dados.inicio_funcionamento();
        this.fim_funcionamento = dados.fim_funcionamento();
        this.complexo = complexo;
    }
}
