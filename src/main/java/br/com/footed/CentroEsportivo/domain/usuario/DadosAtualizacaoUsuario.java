package br.com.footed.CentroEsportivo.domain.usuario;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Integer pessoa_id,
        @NotNull
        @Valid
        DadosAtualizacaoPessoa pessoa) {
}
