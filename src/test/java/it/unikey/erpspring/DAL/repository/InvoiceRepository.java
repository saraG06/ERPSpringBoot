package it.unikey.erpspring.DAL.repository;


import it.unikey.erpspring.DAL.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query(value = "SELECT * FROM Invoice where client = 'reply'", nativeQuery = true)
    List<Invoice> getAllInvoicesClientReply();

    @Query(value = "SELECT p FROM Invoice p WHERE p.date > '2019-12-31'")
    List<Invoice> getAllInvoicesAfter31122019();





}
