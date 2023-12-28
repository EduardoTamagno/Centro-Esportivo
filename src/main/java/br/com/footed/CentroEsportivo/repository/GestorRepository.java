package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.gestor.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestorRepository extends JpaRepository<Gestor, Integer> {}
