package DAL.Repository;

import BLL.mapper.dto.response.FatturaResponseDTO;
import DAL.Entity.Contatto;
import DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, Long> {

    @Query(value= "SELECT * FROM dipendente d WHERE d.assunzione < now", nativeQuery = true)
    List<Dipendente> ultimiDipendentiAssunti(@Param("now") LocalDate now);

    @Query(value= "SELECT * FROM contatto c, fattura f WHERE c.id= :id AND f.contatto= c.id", nativeQuery = true)
    List<FatturaResponseDTO> findAllFatturaContatto(@Param("id") Long id);
}
