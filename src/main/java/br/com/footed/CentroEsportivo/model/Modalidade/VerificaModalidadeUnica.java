package br.com.footed.CentroEsportivo.model.Modalidade;

import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.ModalidadeRepository;
public class VerificaModalidadeUnica extends Validacao {

    private ModalidadeRepository modalidadeRepository;

    public VerificaModalidadeUnica(ModalidadeRepository repository, Validacao proxima) {
        super(proxima);
        this.modalidadeRepository = repository;
    }

    @Override
    public Boolean validar(Object objeto) {
        Modalidade modalidade = (Modalidade) objeto;
        if (modalidadeRepository.findByNome(modalidade.getNome()) != null) {
            throw new RuntimeException("A modalidade " + modalidade.getNome() + " já existe!");
        }
        return proxima.validar(objeto);
    }
}
