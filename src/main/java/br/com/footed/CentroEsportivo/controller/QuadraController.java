package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.model.quadra.DadosCadastroQuadra;
import br.com.footed.CentroEsportivo.model.quadra.DadosDetalhamentoQuadra;
import br.com.footed.CentroEsportivo.service.QuadraService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quadra")
@AllArgsConstructor
public class QuadraController {

    private QuadraService quadraService;

    @PostMapping
    @Transactional
    public DadosDetalhamentoQuadra cadastrar(@RequestBody @Valid DadosCadastroQuadra dados) {
        DadosDetalhamentoQuadra detalhamentoQuadra = quadraService.cadastrar(dados);
        return  detalhamentoQuadra;
    }

}
