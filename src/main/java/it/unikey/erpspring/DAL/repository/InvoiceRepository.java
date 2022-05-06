package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query(value = "SELECT i FROM Invoice i WHERE i.client.name = 'Reply'")
    List<Invoice> getInvoicesClientReply();

    @Query(value = "SELECT i FROM Invoice i WHERE i.date > '2019-31-12'")
    List<Invoice> getInvoicesAfterDate();
}
