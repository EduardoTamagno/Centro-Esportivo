package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.modalidade.EntidadeModalidade;
import br.com.footed.CentroEsportivo.domain.modalidade.ModalidadeRepository;
import br.com.footed.CentroEsportivo.domain.quadra.Quadra;
import br.com.footed.CentroEsportivo.domain.quadra.QuadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quadra")
public class QuadraController {
    @Autowired
    private QuadraRepository quadraRepository;
    @Autowired
    private ModalidadeRepository modalidadeRepository;

    @PostMapping
    public void cadastrar(Quadra quadra){
        this.quadraRepository.save(quadra);
        quadra.getModalidades().stream().forEach( modalidade -> this.modalidadeRepository.save(new EntidadeModalidade(quadra.getQuadra_Id(), modalidade.getId())));
    }

}
