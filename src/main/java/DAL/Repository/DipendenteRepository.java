package DAL.Repository;

import DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

    @Query(value= "SELECT * FROM dipendente d WHERE d.assunzione.getMonth() = :now.getMonth() AND d.assunzione.getYear() = :now.getYear()", nativeQuery = true)
    List<Dipendente> ultimiDipendentiAssunti(@Param("now") LocalDate now);

    @Query(value= "SELECT * FROM dipendente d, operatore o, risorsa r WHERE d.operatore= o.id AND r.operatore= o.id AND r.risorsaAssegnata LIKE 'MACCHINA'", nativeQuery = true)
    List<Dipendente> dipendentiConMacchina();
}
