package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Long> {

    @Query("select o from Ordine o where o.fattura is null")
    List<OrdineResponseDTO> ordiniWithoutfattura();

}
