package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.DAL.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query(value = "SELECT '*' FROM Invoice where client = 'Reply'")
    List<Invoice> getAllInvoicesClientReply();

    @Query(value = "SELECT p FROM Invoice p WHERE p.date > '2019-12-31'")
    List<Invoice> getAllInvoicesDate();

}
