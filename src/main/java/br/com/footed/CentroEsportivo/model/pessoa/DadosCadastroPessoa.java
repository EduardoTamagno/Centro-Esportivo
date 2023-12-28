package br.com.footed.CentroEsportivo.model.pessoa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
public record DadosCadastroPessoa(
        @NotBlank (message = "Nome é uma informação obrigatória!")
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank (message = "Nome é uma informação obrigatória!")
        @Pattern(regexp = "\\d{2,3}", message = "Formato invalido para ddd!")
        String ddd,
        @NotBlank (message = "Telefone é uma informação obrigatória!")
        @Pattern(regexp = "\\d{8}|\\d{9}", message = "Formato invalido para telefone!")
        String telefone,
        String data_nascimento
) {}