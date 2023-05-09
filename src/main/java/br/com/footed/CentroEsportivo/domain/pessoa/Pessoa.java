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
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    @SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", allocationSize = 1)
    private int pessoa_Id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date dataNascimento;

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = "(" + dados.ddd()+ ")" + dados.telefone();
        this.cpf = dados.cpf();
        if (dados.data_nacimento() != null) this.dataNascimento = new Data(dados.data_nacimento()).getData();
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if(dados.nome() != null) this.nome = dados.nome();
        if(dados.email() != null) this.email = dados.email();
        if(dados.data_nacimento() != null) this.dataNascimento = new Data(dados.data_nacimento()).getData();;
        if(dados.ddd() != null && dados.telefone() != null) this.telefone = "(" + dados.ddd()+ ")" + dados.telefone();
    }
}
