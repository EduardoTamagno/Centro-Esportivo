package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.model.gestor.DadosCadastroGestor;
import br.com.footed.CentroEsportivo.model.gestor.DadosDetalhamentoGestor;
import br.com.footed.CentroEsportivo.service.GestorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("gestor")
public class GestorController {

    private GestorService gestorService;

    @PostMapping
    @Transactional
    public DadosDetalhamentoGestor cadastrar(@RequestBody @Valid DadosCadastroGestor dadosCadastro) {
        DadosDetalhamentoGestor detalhamentoGestor = gestorService.cadastrar(dadosCadastro);
        return detalhamentoGestor;
    }
}
