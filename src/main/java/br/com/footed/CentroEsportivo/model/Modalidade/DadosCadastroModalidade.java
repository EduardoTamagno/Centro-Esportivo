package br.com.footed.CentroEsportivo.model.Modalidade;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroModalidade(
   @NotBlank  (message = "Nome é uma informação obrigatória!")
   String nome,
   String descricao
) {}
