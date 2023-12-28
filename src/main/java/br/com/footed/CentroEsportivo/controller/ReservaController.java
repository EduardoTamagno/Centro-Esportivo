package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.model.reserva.DadosCadastroReserva;
import br.com.footed.CentroEsportivo.model.reserva.DadosDetalhamentoReserva;
import br.com.footed.CentroEsportivo.service.ReservaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/reserva")
public class ReservaController {

    private ReservaService reservaService;

    @PostMapping
    @Transactional
    public DadosDetalhamentoReserva cadastrar(@RequestBody @Valid DadosCadastroReserva dados) {
        return reservaService.cadastrar(dados);
    }

}
