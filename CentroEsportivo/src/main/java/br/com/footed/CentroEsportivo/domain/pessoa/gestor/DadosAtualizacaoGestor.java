package br.com.footed.CentroEsportivo.domain.pessoa.gestor;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoGestor(
        @NotNull
        Integer gestor_id,
        @NotNull
        @Valid
        DadosAtualizacaoPessoa pessoa) {}
