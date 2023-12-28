package br.com.footed.CentroEsportivo.model.usuario;

import br.com.footed.CentroEsportivo.infra.validation.Acertado;
import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValidarUsuario {

    private UsuarioRepository usuarioRepository;

    public boolean validarUsuario(Usuario usuario) {
        Validacao validacao = new VerificaUsuarioJaCadastrado(usuarioRepository, new Acertado());
        return validacao.validar(usuario);
    }
}
