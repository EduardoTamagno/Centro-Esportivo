package br.com.footed.CentroEsportivo.model.Modalidade;

import br.com.footed.CentroEsportivo.infra.validation.Acertado;
import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.ModalidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
public class ValidarModalidade {

    private ModalidadeRepository modalidadeRepository;

    public boolean validarModalidade(Modalidade modalidade){
        Validacao validacao = new VerificaModalidadeUnica(modalidadeRepository, new Acertado());
        return validacao.validar(modalidade);
    }

}
