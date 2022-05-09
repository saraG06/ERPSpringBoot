package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query("select c from Cliente c where count(c.contatti) > 10")
    List<ClienteResponseDTO> findAllClientiWithMoreThan10Contatti();
}
