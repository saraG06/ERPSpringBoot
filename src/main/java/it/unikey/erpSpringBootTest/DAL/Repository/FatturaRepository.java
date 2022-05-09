package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FatturaRepository extends JpaRepository<Fattura, Long> {
    @Query("select f from Fattura f where f.cliente = :cliente")
    List<FatturaResponseDTO> findAllFattureByCliente(@Param("cliente") Cliente cliente);
    @Query("select f from Fattura f where f.data > '2019-12-31'")
    List<FatturaResponseDTO> findAllFattureAfter2019();
}
