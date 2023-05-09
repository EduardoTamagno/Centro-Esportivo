package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import br.com.footed.CentroEsportivo.domain.pessoa.gestor.DadosAtualizacaoGestor;
import br.com.footed.CentroEsportivo.domain.pessoa.gestor.DadosCadastroGestor;
import br.com.footed.CentroEsportivo.domain.pessoa.gestor.Gestor;
import br.com.footed.CentroEsportivo.domain.pessoa.gestor.GestorRepository;
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
        Gestor gestor = new Gestor(dados);
        this.repository.save(gestor);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoGestor dados) {
        var gestor = repository.getReferenceById(dados.gestor_id());
        gestor.getPessoa().atualizarInformacoes(dados.pessoa());
    }
}
