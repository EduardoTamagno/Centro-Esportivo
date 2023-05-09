package br.com.footed.CentroEsportivo.domain.pessoa.gestor;

import br.com.footed.CentroEsportivo.domain.endereco.DadosCadastroEndereco;
import br.com.footed.CentroEsportivo.domain.pessoa.DadosCadastroPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroGestor(
        @NotBlank
        @Pattern(regexp = "^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$")
        String cnpj,
        @NotNull
        @Valid
        DadosCadastroPessoa pessoa,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco) {}
