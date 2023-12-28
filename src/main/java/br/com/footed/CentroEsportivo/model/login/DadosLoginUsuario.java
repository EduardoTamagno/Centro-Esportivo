package br.com.footed.CentroEsportivo.model.login;

import jakarta.validation.constraints.NotBlank;

public record DadosLoginUsuario(
        @NotBlank
        String cpf,
        @NotBlank
        String senha
) {}
