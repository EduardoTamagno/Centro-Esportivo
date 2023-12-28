package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.Modalidade.Modalidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Integer> {

    Modalidade findByNome(String nome);

}
