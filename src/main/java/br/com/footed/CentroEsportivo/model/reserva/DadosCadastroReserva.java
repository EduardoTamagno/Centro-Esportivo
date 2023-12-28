package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;
import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.DataAmount;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

public record DadosCadastroReserva(
        @NotNull (message = "Data é uma informação obrigatória!")
        Date data,
        @NotNull (message = "Horario é uma informação obrigatória!")
        LocalTime horario,
        @NotNull (message = "Quadra é uma informação obrigatória!")
        Integer quadraId,
        @NotNull (message = "Usuario é uma informação obrigatória!")
        Integer usuarioId
) {}
