package br.com.footed.CentroEsportivo.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoEndereco(
        String logradouro,
        String bairro,
        @Pattern(regexp = "^.{0}$|^.{8}$\n")
        String cep,
        String cidade,
        String uf,
        int numero
) {
}
