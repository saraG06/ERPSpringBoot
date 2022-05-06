package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Contatto;
import it.unikey.erpspring.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto,Long> {

    @Query(value = "SELECT c FROM Contatto c WHERE c.fatturas IS NOT NULL ")
    List<Fattura> fattureDiAzienda();

}
