package DAL.Repository;

import BLL.mapper.dto.response.FatturaResponseDTO;
import DAL.Entity.Contatto;
import DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FatturaRepository  extends JpaRepository<Fattura, Long> {

    @Query(value= "SELECT * FROM fattura f WHERE f.data > '2019-12-31'", nativeQuery = true)
    List<Fattura> findAfter31122019();

    @Query(value= "SELECT * FROM fattura f WHERE f.contatto.cliente.nome LIKE 'Reply'", nativeQuery= true)
    List<Fattura> findFattureReply();

    @Query(value= "SELECT * FROM contatto c, fattura f WHERE c.id= :id AND f.contatto= c.id", nativeQuery = true)
    List<FatturaResponseDTO> findAllFatturaContatto(@Param("contatto") Contatto contatto);

}
