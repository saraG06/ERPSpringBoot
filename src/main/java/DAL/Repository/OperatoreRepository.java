package DAL.Repository;

import DAL.Entity.Ordine;
import DAL.Entity.persone.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {
}
