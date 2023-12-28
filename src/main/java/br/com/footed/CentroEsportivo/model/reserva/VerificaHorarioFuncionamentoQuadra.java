package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.ReservaRepository;

public class VerificaHorarioFuncionamentoQuadra extends Validacao {

    public VerificaHorarioFuncionamentoQuadra(Validacao proxima) {
        super(proxima);
    }

    @Override
    public Boolean validar(Object objeto) {
        Reserva reserva = (Reserva) objeto;
        if (reserva.getHorario().isBefore(reserva.getQuadra().getInicio_funcionamento()))
            throw new RuntimeException("Está quadra inicia seu funcionamento a partir dàs " + reserva.getQuadra().getInicio_funcionamento().toString() );
        if (reserva.getHorario().isAfter(reserva.getQuadra().getFim_funcionamento()))
            throw new RuntimeException("Está quadra encerra o funcionamento a partir dàs " + reserva.getQuadra().getFim_funcionamento().toString());
        return proxima.validar(objeto);
    }
}
