package riwi.simulacro_filtro.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import riwi.simulacro_filtro.domain.entities.Assingnments;

@Repository
public interface AssingnmentsRepository extends JpaRepository<Assingnments, Long>{
  
}
