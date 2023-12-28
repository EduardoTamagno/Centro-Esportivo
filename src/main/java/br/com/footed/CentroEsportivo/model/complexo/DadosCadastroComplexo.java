package br.com.footed.CentroEsportivo.model.complexo;

import br.com.footed.CentroEsportivo.model.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroComplexo(
        @NotBlank (message = "Nome é uma informação obrigatória!")
        String nome,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco) {}