package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Cliente;
import it.unikey.erpspring.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura,Long> {

    @Query(value = "SELECT f FROM Fattura  f WHERE f.cliente.name = 'reply'")
    List<Cliente> clienti();

}
