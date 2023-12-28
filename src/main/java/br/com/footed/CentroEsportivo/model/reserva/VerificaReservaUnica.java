package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.ReservaRepository;

public class VerificaReservaUnica extends Validacao {
    private ReservaRepository reservaRepository;

    public VerificaReservaUnica(ReservaRepository repository, Validacao proxima) {
        super(proxima);
        this.reservaRepository = repository;
    }

    @Override
    public Boolean validar(Object objeto) {
        Reserva reserva = (Reserva) objeto;
        if (reservaRepository.findByQuadraAndDataAndHorario(reserva.getQuadra(), reserva.getData(), reserva.getHorario()) != null)
            throw new RuntimeException("Quadra " + reserva.getQuadra().getNome() + " indisponível no horario  " + reserva.getHorario());
        return proxima.validar(objeto);
    }
}
