package br.com.footed.CentroEsportivo.model.usuario;

import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.UsuarioRepository;

public class VerificaUsuarioJaCadastrado extends Validacao {

    private UsuarioRepository usuarioRepository;

    public VerificaUsuarioJaCadastrado(UsuarioRepository repository, Validacao proxima) {
        super(proxima);
        this.usuarioRepository = repository;
    }

    @Override
    public Boolean validar(Object objeto) {
        Usuario usuario = (Usuario) objeto;
        if (usuarioRepository.findByCpf(usuario.getCpf()) != null)
            throw new RuntimeException("Usuario de numero de CPF: " + usuario.getCpf() + "já cadastrado!");
        return proxima.validar(objeto);
    }
}
