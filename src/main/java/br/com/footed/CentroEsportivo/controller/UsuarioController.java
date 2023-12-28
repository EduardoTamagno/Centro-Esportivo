package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.model.usuario.DadosCadastroUsuario;
import br.com.footed.CentroEsportivo.model.usuario.DadosDetalhamentoUsuario;
import br.com.footed.CentroEsportivo.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    @Transactional
    public DadosDetalhamentoUsuario cadastrar(@RequestBody @Valid DadosCadastroUsuario dados){
        DadosDetalhamentoUsuario detalhamentoUsuario = usuarioService.cadastrar(dados);
        return detalhamentoUsuario;
    }
}
