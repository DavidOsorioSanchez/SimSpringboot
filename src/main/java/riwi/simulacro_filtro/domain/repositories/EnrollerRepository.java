package riwi.simulacro_filtro.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import riwi.simulacro_filtro.domain.entities.Enroller;

@Repository
public interface EnrollerRepository extends JpaRepository<Enroller, Long> {
  
}
