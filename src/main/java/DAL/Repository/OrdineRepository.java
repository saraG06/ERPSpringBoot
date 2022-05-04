package DAL.Repository;

import DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine,Long>{

    List<Ordine> findAllByNome(String nome);
}
