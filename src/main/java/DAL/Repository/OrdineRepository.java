package DAL.Repository;

import DAL.Entity.Fattura;
import DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine,Long> {

    @Query(value = "SELECT o FROM Ordine o WHERE o.fatture IS NULL")
    List<Fattura> fattureNonPresenti();
}
