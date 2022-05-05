package DAL.Repository;

import DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Long> {

    @Query(value= "SELECT * FROM ordine o WHERE o.fattura IS NULL", nativeQuery = true)
    List<Ordine> ordiniSenzaFattura();

}
