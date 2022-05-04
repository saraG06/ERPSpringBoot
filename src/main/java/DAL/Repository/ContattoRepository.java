package DAL.Repository;

import DAL.Entity.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContattoRepository extends JpaRepository<Contatto,Long> {
}
