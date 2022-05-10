package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Risorsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RisorsaRepository extends JpaRepository<Risorsa,Long> {
}