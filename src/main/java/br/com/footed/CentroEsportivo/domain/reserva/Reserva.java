package br.com.footed.CentroEsportivo.domain.reserva;

import br.com.footed.CentroEsportivo.domain.pessoa.dados.Data;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reserva_id;
    private Date data;
    private Time horario;
    @JoinTable(name = "pessoa", joinColumns = @JoinColumn(name = "pessoa_id"), inverseJoinColumns = @JoinColumn(name = "pessoa_id"))
    private Integer pessoa_id;
    @JoinTable(name = "quadra", joinColumns = @JoinColumn(name = "quadra_id"), inverseJoinColumns = @JoinColumn(name = "quadra_id"))
    private Integer quadra_id;

    public Reserva(DadosCadastroReserva dados) {
        this.data = new Data(dados.data()).getData();
        this.horario = dados.horario();
        this.pessoa_id = dados.pessoa_id();
        this.quadra_id = dados.quadra_id();
    }

}
