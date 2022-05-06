package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Cliente;
import it.unikey.erpspringboot.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura,Long> {

    //trovare tutte le fatture emesse dopo la data 31/12/2019
    @Query("SELECT f FROM Fattura f WHERE f.data > '2019-12-31'")
    List<Fattura> getAllFattureEmesseDopo31_12_2019();

    //trovare tutte le fatture che hanno come cliente "Reply"
    @Query("SELECT f FROM Fattura f WHERE f.contatto.cliente='Reply'")
    List<Fattura> getAllFattureClienteReply();

    //a partire da un contatto si deve poter consultare le fatture a carico della propria societa (il cliente)
    @Query("SELECT f FROM Fattura f WHERE f.contatto.cliente=:cliente")
    List<Fattura> getAllFattureCliente(@Param("cliente") Cliente cliente);
}
