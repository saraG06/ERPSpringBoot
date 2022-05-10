package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

    /*@Query(value = "SELECT r FROM Dipendente r WHERE r.risorsas IS NOT NULL")
    List<Dipendente> dipendentiConRisorsa();*/

}
