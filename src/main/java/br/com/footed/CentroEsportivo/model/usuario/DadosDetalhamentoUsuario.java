package br.com.footed.CentroEsportivo.model.usuario;

import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;
import lombok.AllArgsConstructor;


public record DadosDetalhamentoUsuario(Long usuario_id, String cpf, String senha, Pessoa pessoa) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getUsuarioId(), usuario.getCpf(), usuario.getSenha(), usuario.getPessoa());
    }

}
