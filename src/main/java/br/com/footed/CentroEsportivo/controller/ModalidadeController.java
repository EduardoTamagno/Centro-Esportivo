package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.model.Modalidade.DadosCadastroModalidade;
import br.com.footed.CentroEsportivo.model.Modalidade.DadosDetalhamentoModalidade;
import br.com.footed.CentroEsportivo.service.ModalidadeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/modalidade")
public class ModalidadeController {

    private ModalidadeService modalidadeService;

    @PostMapping
    @Transactional
    public DadosDetalhamentoModalidade cadastrar(@RequestBody @Valid DadosCadastroModalidade dados){
        return modalidadeService.cadastrar(dados);
    }

}
