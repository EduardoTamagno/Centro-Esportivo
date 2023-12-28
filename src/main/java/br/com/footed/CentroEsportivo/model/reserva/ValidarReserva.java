package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.infra.validation.Acertado;
import br.com.footed.CentroEsportivo.infra.validation.Validacao;
import br.com.footed.CentroEsportivo.repository.ReservaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValidarReserva {

    private ReservaRepository reservaRepository;

    public boolean validarReserva (Reserva reserva) {
        Validacao validacao = new VerificaReservaUnica(
                reservaRepository, new VerificaHorarioFuncionamentoQuadra(
                        new Acertado()));
        return validacao.validar(reserva);
    }
}
