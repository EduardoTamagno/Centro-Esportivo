package br.com.footed.CentroEsportivo.model.gestor;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;
import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;

public record DadosDetalhamentoGestor(Long gestor_id, String cnpj, String senha, Pessoa pessoa, Complexo complexo) {

    public DadosDetalhamentoGestor(Gestor gestor){
        this(gestor.getGestor_id(), gestor.getCnpj(), gestor.getSenha(), gestor.getPessoa(), gestor.getComplexo());
    }

}
