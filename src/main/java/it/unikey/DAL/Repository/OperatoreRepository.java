package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore, Long> {

    @Query(value= "SELECT * FROM risorsa r, operatore o WHERE r.operatore= o.id AND r.risorsaAssegnata LIKE 'MACCHINA'", nativeQuery = true)
    List<Operatore> dipendentiMacchina();

    @Query(value= "SELECT count(o.id) FROM operatore o, azienda a WHERE o.azienda= a.id", nativeQuery = true)
    Long contaOperatori();
}
