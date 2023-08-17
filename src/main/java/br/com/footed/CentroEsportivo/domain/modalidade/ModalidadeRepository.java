package br.com.footed.CentroEsportivo.domain.modalidade;

import br.com.footed.CentroEsportivo.domain.gestor.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Integer> {}

