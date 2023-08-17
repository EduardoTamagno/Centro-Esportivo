package br.com.footed.CentroEsportivo.domain.reserva;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.sql.Time;
import java.util.Date;

public record DadosCadastroReserva(
   @NotBlank
   String data,
   @NotNull
   Time horario,
   @NotNull
   Integer pessoa_id,
   @NotNull
   Integer quadra_id
) {}
