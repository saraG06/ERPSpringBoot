package DAL.Repository;

import DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FatturaRepository  extends JpaRepository<Fattura, Long> {

    @Query(value= "SELECT * FROM fattura f", nativeQuery = true)
    List<Fattura> findAll();

    @Query(value= "SELECT * FROM fattura f WHERE f.data > '2019-12-31'", nativeQuery = true)
    List<Fattura> findAfter31122019();

    @Query(value= "SELECT * FROM fattura f WHERE f.contatto.cliente.nome LIKE 'Reply'", nativeQuery= true)
    List<Fattura> findFattureReply();

}
