package br.com.footed.CentroEsportivo.domain.quadra;

import br.com.footed.CentroEsportivo.domain.modalidade.Modalidade;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "quadra")
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quadra_sequence")
    @SequenceGenerator(name = "quadra_sequence", sequenceName = "quadra_sequence", allocationSize = 1)
    private Integer quadra_Id;
    //@Column(name = "nome da coluna")
    private String nome;
    private BigDecimal preco;
    private String descricao;
    private Time inicio_funcionamento;
    private Time fim_funcionamento;
    @Embedded
    private List<Modalidade> modalidades = new ArrayList<>();;

    public Quadra(String nome, BigDecimal preco, String descricao, Time inicio_funcionamento, Time fim_funcionamento) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.inicio_funcionamento = inicio_funcionamento;
        this.fim_funcionamento = fim_funcionamento;
    }

    public void addModalidade(Modalidade modalidade) {
        this.modalidades.add(modalidade);
    }

}
