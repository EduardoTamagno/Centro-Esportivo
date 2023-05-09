package br.com.footed.CentroEsportivo.domain.modalidade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "quadra_modalidade")
public class EntidadeModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quadra_sequence")
    @SequenceGenerator(name = "quadra_sequence", sequenceName = "quadra_sequence", allocationSize = 1)
    private Integer quadra_modalidade_Id;
    private Integer quadra_Id;
    private Integer modalidade_Id;

    public EntidadeModalidade(Integer quadra_Id, Integer modalidade_Id) {
        this.quadra_Id = quadra_Id;
        this.modalidade_Id = modalidade_Id;
    }
}
