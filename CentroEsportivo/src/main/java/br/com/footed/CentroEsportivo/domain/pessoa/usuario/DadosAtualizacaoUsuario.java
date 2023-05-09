package br.com.footed.CentroEsportivo.domain.pessoa.usuario;

import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Integer usuario_id,
        @NotNull
        @Valid
        DadosAtualizacaoPessoa pessoa) {
}
