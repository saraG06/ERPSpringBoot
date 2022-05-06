package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FatturaRepository extends JpaRepository<Fattura, Long> {
    @Query("select f from Fattura f where f.ordine.cliente = :cliente")
    List<Fattura> findAllFattureByCliente(@Param("cliente") Cliente cliente);
    @Query("select f from Fattura f where f.data > '2019-12-31'")
    List<Fattura> findAllFattureAfter2019();
}
