package br.com.footed.CentroEsportivo.domain.modalidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends JpaRepository<EntidadeModalidade, Integer> {}
