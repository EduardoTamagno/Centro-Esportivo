package br.com.footed.CentroEsportivo.service;

import br.com.footed.CentroEsportivo.model.quadra.DadosCadastroQuadra;
import br.com.footed.CentroEsportivo.model.quadra.DadosDetalhamentoQuadra;
import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import br.com.footed.CentroEsportivo.repository.ComplexoRepository;
import br.com.footed.CentroEsportivo.repository.QuadraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuadraService {

    private QuadraRepository quadraRpository;
    private ComplexoRepository complexoRepository;

    public DadosDetalhamentoQuadra cadastrar(DadosCadastroQuadra dados) {
        Quadra quadra = new Quadra(dados, complexoRepository.findByComplexoId(dados.complexo_id()));
        quadraRpository.save(quadra);
        return new DadosDetalhamentoQuadra(quadra);
    }
}