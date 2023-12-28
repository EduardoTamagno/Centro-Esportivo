package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import br.com.footed.CentroEsportivo.model.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

public interface ReservaRepository  extends JpaRepository<Reserva, Integer> {

    Reserva findByQuadraAndDataAndHorario(Quadra quadra, Date data, LocalTime horaio);

}
