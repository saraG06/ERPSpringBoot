package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine,Long> {

    //trovare tutti gli ordini che non sono associati ancora a fatture
    @Query("SELECT o FROM Ordine o WHERE o.fattura IS NULL")
    List<Ordine> getAllOrdiniSenzaFattura();
}
