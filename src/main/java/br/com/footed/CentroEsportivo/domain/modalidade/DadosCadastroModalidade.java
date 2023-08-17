package br.com.footed.CentroEsportivo.domain.modalidade;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroModalidade(
        @NotBlank
        String nome,
        @NotBlank
        String abreviacao
){}
