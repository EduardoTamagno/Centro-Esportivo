package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.quadra.DadosAtualizaQuadra;
import br.com.footed.CentroEsportivo.domain.quadra.DadosCadastroQuadra;
import br.com.footed.CentroEsportivo.domain.quadra.Quadra;
import br.com.footed.CentroEsportivo.domain.quadra.QuadraRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quadra")
public class QuadraController {

    @Autowired
    private QuadraRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroQuadra dados){
        this.repository.save(new Quadra(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaQuadra dados){
        var quadra = repository.getReferenceById(dados.quadra_id());
        quadra.atualizaInformacoes(dados);
    }
}
