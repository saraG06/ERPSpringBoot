package DAL.Repository;

import DAL.Entity.Dipendente;
import DAL.Entity.Risorsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RisorsaRepository extends JpaRepository<Risorsa, Long> {

    @Query(value= "INSERT INTO risorsa r VALUES risorsa WHERE (:capo.ruolo LIKE 'PROJECTMANAGER' AND :d.ruolo LIKE 'OPERATOR') OR :capo.ruolo LIKE 'MANAGER'", nativeQuery = true)
    void assegnaRisorsa(@Param("capo") Dipendente capo, @Param("dipendente") Dipendente d, @Param("risorsa") String risorsa);
}
