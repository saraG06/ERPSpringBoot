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

    @Query(value = "SELECT p FROM Invoice p where p.client = :client")
    List<Invoice> getAllInvoicesbyClient(@Param("client") Client client );

    @Query(value = "SELECT p FROM Invoice p WHERE p.date > '2019-12-31'")
    List<Invoice> getAllInvoicesAfter31122019();





}
