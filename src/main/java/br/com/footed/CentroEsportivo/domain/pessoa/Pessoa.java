package br.com.footed.CentroEsportivo.domain.pessoa;

import br.com.footed.CentroEsportivo.domain.pessoa.dados.Data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pessoa_Id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date data_nascimento;

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = "(" + dados.ddd()+ ")" + dados.telefone();
        this.cpf = dados.cpf();
        if (dados.data_nascimento() != null) this.data_nascimento = new Data(dados.data_nascimento()).getData();
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if(dados.nome() != null) this.nome = dados.nome();
        if(dados.email() != null) this.email = dados.email();
        if(dados.data_nascimento() != null) this.data_nascimento = new Data(dados.data_nascimento()).getData();;
        if(dados.ddd() != null && dados.telefone() != null) this.telefone = "(" + dados.ddd()+ ")" + dados.telefone();
    }
}
