package br.com.footed.CentroEsportivo.domain.endereco;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_sequence")
    @SequenceGenerator(name = "endereco_sequence", sequenceName = "endereco_sequence", allocationSize = 1)
    private int endereco_id;
    private String logradouro;
    private String bairro;
    private String cep;
    private int numero;
    private String cidade;
    private String uf;

    public Endereco(DadosCadastroEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }
}
