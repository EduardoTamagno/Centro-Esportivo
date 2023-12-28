package br.com.footed.CentroEsportivo.model.reserva;

import br.com.footed.CentroEsportivo.model.pessoa.Pessoa;
import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import br.com.footed.CentroEsportivo.model.usuario.Usuario;
import br.com.footed.CentroEsportivo.service.UsuarioService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservaId;
    private Date data;
    private LocalTime horario;
    @OneToOne
    @JoinColumn(name = "quadra_id")
    private Quadra quadra;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Reserva(DadosCadastroReserva dados, Quadra quadra, Usuario usuario) {
        this.data = dados.data();
        this.horario = dados.horario();
        this.quadra = quadra;
        this.usuario = usuario;
    }
}
