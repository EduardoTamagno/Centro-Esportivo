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
public class  Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quadra_id;

    private String nome;

    private BigDecimal preco;

    private String descricao;
    
    private Time inicio_funcionamento;

    private Time fim_funcionamento;

    //@ManyToMany
    @JoinTable(name = "complexo", joinColumns = @JoinColumn(name = "complexo_id"), inverseJoinColumns = @JoinColumn(name = "complexo_id"))
    private Integer complexo_id;

    //private List<Modalidade> modalidades = new ArrayList<>();

    public Quadra(DadosCadastroQuadra dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.inicio_funcionamento = dados.inicio_funcionamento();
        this.fim_funcionamento = dados.fim_funcionamento();
        this.complexo_id = dados.complexo_id();
    }

    public void atualizaInformacoes(DadosAtualizaQuadra dados){
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.inicio_funcionamento = dados.inicio_funcionamento();
        this.fim_funcionamento = dados.fim_funcionamento();
    }

}
