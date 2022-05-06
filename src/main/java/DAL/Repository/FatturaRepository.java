package DAL.Repository;

import DAL.Entity.Fattura;
import DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura,Long> {

    @Query(value = "SELECT * FROM Fattura f WHERE f.data > :dopo2019", nativeQuery = true)
    List<Fattura> dopo2019(@Param("dopo2019") LocalDate dopo2019);

    @Query(value = "SELECT f FROM Fattura f,Contatto c,Cliente cl WHERE f.contatto.cliente.nome Like :cliente", nativeQuery = true)
    List<Fattura> fattureCliente(@Param("cliente") String cliente);
}
