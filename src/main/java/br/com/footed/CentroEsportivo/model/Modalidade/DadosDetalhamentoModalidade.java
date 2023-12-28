package br.com.footed.CentroEsportivo.model.Modalidade;

public record DadosDetalhamentoModalidade (String nome, String descricao){
    public DadosDetalhamentoModalidade(Modalidade modalida){
        this(modalida.getNome(), modalida.getDescricao());
    }
}
