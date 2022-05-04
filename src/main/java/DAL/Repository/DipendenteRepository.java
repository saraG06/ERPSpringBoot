package DAL.Repository;

import DAL.Entity.Ordine;
import DAL.Entity.persone.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {
}
