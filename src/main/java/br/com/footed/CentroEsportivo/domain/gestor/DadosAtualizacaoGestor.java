package br.com.footed.CentroEsportivo.domain.gestor;

import br.com.footed.CentroEsportivo.domain.complexo.DadosAtualizacaoComplexo;
import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoGestor(
        @NotNull
        Integer pessoa_id,
        @Valid
        DadosAtualizacaoPessoa pessoa,
        @Valid
        DadosAtualizacaoComplexo complexo
) {}
