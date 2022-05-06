package DAL.Repository;

import BLL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

    @Query(value = "SELECT r FROM Dipendente r WHERE r.risorsas IS NOT NULL")
    List<Dipendente> dipendentiConRisorsa();

}
