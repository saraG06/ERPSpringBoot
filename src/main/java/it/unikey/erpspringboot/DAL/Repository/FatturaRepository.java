package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura,Long> {
}
