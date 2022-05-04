package DAL.Repository;

import DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FatturaRepository extends JpaRepository<Fattura,Long> {
}
