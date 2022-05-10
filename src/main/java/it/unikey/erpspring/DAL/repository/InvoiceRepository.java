package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query("SELECT i FROM Invoice i WHERE i.client =: client")
    List<Invoice> getAllInvoicesByClient(@Param("client") Client client);

    @Query ("SELECT p FROM Invoice p WHERE p.date > '2019-12-31'")
    List<Invoice> getAllInvoicesAfter2019();

}
