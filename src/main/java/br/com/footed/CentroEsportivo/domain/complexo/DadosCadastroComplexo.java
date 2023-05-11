package br.com.footed.CentroEsportivo.domain.complexo;

import br.com.footed.CentroEsportivo.domain.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroComplexo(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$")
        String cnpj,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco) {}
