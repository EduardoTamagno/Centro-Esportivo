package br.com.footed.CentroEsportivo.service;

import br.com.footed.CentroEsportivo.model.Modalidade.*;
import br.com.footed.CentroEsportivo.repository.ModalidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModalidadeService {

    private ModalidadeRepository modalidadeRepository;
    public DadosDetalhamentoModalidade cadastrar(DadosCadastroModalidade dados){
        Modalidade modalidade = new Modalidade(dados);
        if(new ValidarModalidade(modalidadeRepository).validarModalidade(modalidade))
            modalidadeRepository.save(modalidade);
        return new DadosDetalhamentoModalidade(modalidade);
    }

}
