package br.com.footed.CentroEsportivo.domain.modalidade;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@NoArgsConstructor
@Entity
@Table(name = "modalidade")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer modalidade_Id;
    String nome;
    String abreviacao;

    public Modalidade(DadosCadastroModalidade dados) {
        this.nome = dados.nome();
        this.abreviacao = dados.abreviacao();
    }
}
