package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.gestor.DadosAtualizacaoGestor;
import br.com.footed.CentroEsportivo.domain.gestor.DadosCadastroGestor;
import br.com.footed.CentroEsportivo.domain.gestor.Gestor;
import br.com.footed.CentroEsportivo.domain.gestor.GestorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestor")
public class GestorController {
    @Autowired
    private GestorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroGestor dados) {
        this.repository.save(new Gestor(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoGestor dados) {
        var gestor = repository.getReferenceById(dados.pessoa_id());
        gestor.atualizarInformacoes(dados);
    }
}
