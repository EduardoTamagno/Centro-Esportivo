package br.com.footed.CentroEsportivo.domain.usuario;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosCadastroPessoa;
import br.com.footed.CentroEsportivo.domain.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "usuario")
public class Usuario extends Pessoa{

    private char valido;
    public Usuario(DadosCadastroPessoa dados) {
        super(dados);
        this.valido = 'V';
    }
}
