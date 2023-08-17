package br.com.footed.CentroEsportivo.domain.quadra;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Timestamp;

import java.math.BigDecimal;
import java.sql.Time;

public record DadosAtualizaQuadra(
        @NotNull
        Integer quadra_id,
        @NotBlank
        String nome,
        @NotNull
        BigDecimal preco,
        String descricao,
        @NotNull
        @Timestamp
        Time inicio_funcionamento,
        @NotNull
        @Timestamp
        Time fim_funcionamento
) {}
