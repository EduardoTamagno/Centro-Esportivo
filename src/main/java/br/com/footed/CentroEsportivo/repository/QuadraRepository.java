package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.quadra.Quadra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadraRepository extends JpaRepository<Quadra, Integer> {

    Quadra findByQuadraId(Integer quadraId);

}
