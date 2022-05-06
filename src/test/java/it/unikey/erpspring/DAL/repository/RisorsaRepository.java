package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.AssignedResources;
import it.unikey.erpspring.DAL.entity.Risorsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RisorsaRepository extends JpaRepository<Risorsa, Long> {
}
