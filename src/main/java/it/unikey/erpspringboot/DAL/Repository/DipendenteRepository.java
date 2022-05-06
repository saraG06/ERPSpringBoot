package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

    // trovare  il numero dei dipendenti totali dell'azienda
    @Query("SELECT COUNT(d) FROM Dipendente d WHERE d.operatore.azienda=:aziendaId")
    Integer getNDIpendentiByAziendaId(@Param("aziendaId") Integer aziendaId);

    //trovare tutti i dipendenti che hanno una macchina assegnata
    @Query("SELECT d FROM Dipendente d WHERE d.risorsa IS NOT NULL")
    List<Dipendente> getDipendentiWithMacchina();
}
