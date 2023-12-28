package br.com.footed.CentroEsportivo.service;

import br.com.footed.CentroEsportivo.model.reserva.DadosCadastroReserva;
import br.com.footed.CentroEsportivo.model.reserva.DadosDetalhamentoReserva;
import br.com.footed.CentroEsportivo.model.reserva.Reserva;
import br.com.footed.CentroEsportivo.model.reserva.ValidarReserva;
import br.com.footed.CentroEsportivo.repository.QuadraRepository;
import br.com.footed.CentroEsportivo.repository.ReservaRepository;
import br.com.footed.CentroEsportivo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservaService {

    private UsuarioRepository usuarioRepository;
    private QuadraRepository quadraRepository;
    private ReservaRepository reservaRepository;

    public DadosDetalhamentoReserva cadastrar(DadosCadastroReserva dados){
        Reserva reserva = new Reserva(dados, quadraRepository.findByQuadraId(dados.quadraId()), usuarioRepository.findByUsuarioId(dados.usuarioId()));
        if (new ValidarReserva(reservaRepository).validarReserva(reserva))
            reservaRepository.save(reserva);
        return new DadosDetalhamentoReserva(reserva);
    }

}
