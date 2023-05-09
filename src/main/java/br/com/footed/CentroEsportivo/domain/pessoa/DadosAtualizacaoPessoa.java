package br.com.footed.CentroEsportivo.domain.pessoa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoPessoa(
        String nome,
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{2}")
        String ddd,
        @NotBlank
        @Pattern(regexp = "\\d{8}|\\d{9}")
        String telefone,
        String data_nacimento) {}
