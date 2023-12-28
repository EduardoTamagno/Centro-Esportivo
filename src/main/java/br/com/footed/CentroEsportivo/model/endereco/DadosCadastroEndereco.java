package br.com.footed.CentroEsportivo.model.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(
        @NotBlank (message = "Logradouro é uma informação obrigatória!")
        String logradouro,
        @NotBlank (message = "Bairro é uma informação obrigatória!")
        String bairro,
        @NotBlank (message = "CEP é uma informação obrigatória!")
        @Pattern(regexp = "\\d{8}", message = "Formato invalido para CEP!")
        String cep,
        @NotBlank (message = "Cidade é uma informação obrigatória!")
        String cidade,
        @NotBlank (message = "UF é uma informação obrigatória!")
        String uf,
        int numero
) {}