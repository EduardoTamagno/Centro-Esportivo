package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;
import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import br.com.footed.CentroEsportivo.model.usuario.Usuario;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public record DadosDetalhamentoReserva(Date data, LocalTime horario, Quadra quadra, Usuario usuario) {
    public DadosDetalhamentoReserva(Reserva reserva) {
        this(reserva.getData(), reserva.getHorario(), reserva.getQuadra(), reserva.getUsuario());
    }
}
