package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.domain.reserva.DadosCadastroReserva;
import br.com.footed.CentroEsportivo.domain.reserva.Reserva;
import br.com.footed.CentroEsportivo.domain.reserva.ReservaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroReserva dados) {
        this.repository.save(new Reserva(dados));
    }
}
