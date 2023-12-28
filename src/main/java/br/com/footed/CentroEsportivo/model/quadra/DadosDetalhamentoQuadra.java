package br.com.footed.CentroEsportivo.model.quadra;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalTime;

public record DadosDetalhamentoQuadra(String nome, BigDecimal preco, String descricao, LocalTime inicio_funcionamento, LocalTime fim_funcionamento, Complexo complexo) {
    public DadosDetalhamentoQuadra(Quadra quadra){
        this(quadra.getNome(), quadra.getPreco(), quadra.getDescricao(), quadra.getInicio_funcionamento(), quadra.getFim_funcionamento(), quadra.getComplexo());
    }
}
