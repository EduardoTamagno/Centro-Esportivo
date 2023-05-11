package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosCadastroPessoa;
import br.com.footed.CentroEsportivo.domain.usuario.DadosAtualizacaoUsuario;
import br.com.footed.CentroEsportivo.domain.usuario.Usuario;
import br.com.footed.CentroEsportivo.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPessoa dados) {
        this.repository.save(new Usuario(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoUsuario dados) {
        var usuario = repository.getReferenceById(dados.pessoa_id());
        usuario.atualizarInformacoes(dados.pessoa());
    }
}
