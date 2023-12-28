package br.com.footed.CentroEsportivo.model.quadra;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Timestamp;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalTime;

public record DadosCadastroQuadra(
        @NotBlank (message = "Nome é uma informação obrigatória!")
        String nome,
        @NotNull (message = "Preço é uma informação obrigatória!")
        BigDecimal preco,
        String descricao,
        @NotNull (message = "Inicio do Funcionamento é uma informação obrigatória!")
        @Timestamp
        LocalTime inicio_funcionamento,
        @NotNull (message = "Fim do Funcionamento é uma informação obrigatória!")
        @Timestamp
        LocalTime fim_funcionamento,
        @NotNull
        Integer complexo_id
) {}

