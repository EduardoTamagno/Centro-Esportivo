package br.com.footed.CentroEsportivo.model.pessoa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pessoa_Id;
    private String nome;
    private String email;
    private String telefone;

    private Date data_nascimento;


    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = "(" + dados.ddd()+ ")" + dados.telefone();
        if (dados.data_nascimento() != null) this.data_nascimento = new Date(dados.data_nascimento());
    }
}
