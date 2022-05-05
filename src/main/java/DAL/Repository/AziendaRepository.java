package DAL.Repository;

import DAL.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda, Long> {

    @Query(value= "SELECT count(d.id) FROM azienda a, dipendente d WHERE d.azienda= a.id", nativeQuery = true)
    int numeroDipendenti();
}
