package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.modalidade.DadosCadastroModalidade;
import br.com.footed.CentroEsportivo.domain.modalidade.Modalidade;
import br.com.footed.CentroEsportivo.domain.modalidade.ModalidadeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modalidade")
public class ModalidadeController {

    @Autowired
    private ModalidadeRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroModalidade dados){
        repository.save(new Modalidade(dados));
    }
}
