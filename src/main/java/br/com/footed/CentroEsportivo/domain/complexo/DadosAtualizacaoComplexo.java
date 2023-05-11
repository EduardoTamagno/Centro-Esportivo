package br.com.footed.CentroEsportivo.domain.complexo;

import br.com.footed.CentroEsportivo.domain.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoComplexo(
        String nome,
        @Valid
        DadosCadastroEndereco endereco) {}
