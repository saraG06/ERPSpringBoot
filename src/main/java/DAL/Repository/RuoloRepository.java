package DAL.Repository;

import DAL.Entity.Dipendente;
import DAL.Entity.Ruolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Long> {

    @Query(value= "INSERT INTO ruolo r VALUES ruolo, d", nativeQuery = true)
    void assegnaRuolo(@Param("capo") Dipendente capo, @Param("dipendente") Dipendente d, @Param("ruolo") String ruolo);
}
