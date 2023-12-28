package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;
import br.com.footed.CentroEsportivo.model.gestor.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplexoRepository extends JpaRepository<Complexo, Integer> {
    Complexo findByComplexoId(int complexoId);
}
