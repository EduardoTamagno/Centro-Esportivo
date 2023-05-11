package br.com.footed.CentroEsportivo.domain.gestor;

import br.com.footed.CentroEsportivo.domain.complexo.Complexo;
import br.com.footed.CentroEsportivo.domain.pessoa.DadosAtualizacaoPessoa;
import br.com.footed.CentroEsportivo.domain.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Gestor extends Pessoa{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "complexo_id")
    private Complexo complexo;

    public Gestor(DadosCadastroGestor dados) {
        super(dados.pessoa());
        this.complexo = new Complexo(dados.complexo());
    }
    public void atualizarInformacoes(DadosAtualizacaoGestor dados){
        super.atualizarInformacoes(dados.pessoa());
        this.complexo.atualizarInformacoes(dados.complexo());
    }
}
