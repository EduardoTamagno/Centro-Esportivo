package br.com.footed.CentroEsportivo.service;

import br.com.footed.CentroEsportivo.model.usuario.DadosCadastroUsuario;
import br.com.footed.CentroEsportivo.model.usuario.DadosDetalhamentoUsuario;
import br.com.footed.CentroEsportivo.model.usuario.Usuario;
import br.com.footed.CentroEsportivo.model.usuario.ValidarUsuario;
import br.com.footed.CentroEsportivo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public DadosDetalhamentoUsuario cadastrar(DadosCadastroUsuario dadosCadastro) {
        Usuario usuario = new Usuario(dadosCadastro.cpf(), passwordEncoder.encode(dadosCadastro.senha()), dadosCadastro.dadosPessoa());
        if (new ValidarUsuario(usuarioRepository).validarUsuario(usuario))
            usuarioRepository.save(usuario);
        return new DadosDetalhamentoUsuario(usuario);
    }

}
