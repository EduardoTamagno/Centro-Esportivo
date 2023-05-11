package br.com.footed.CentroEsportivo.domain.gestor;

import br.com.footed.CentroEsportivo.domain.complexo.DadosCadastroComplexo;
import br.com.footed.CentroEsportivo.domain.pessoa.DadosCadastroPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroGestor(
        @NotNull
        @Valid
        DadosCadastroPessoa pessoa,
        @NotNull
        @Valid
        DadosCadastroComplexo complexo) {}
