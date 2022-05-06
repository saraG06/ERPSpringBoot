package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query("Select i from Invoice i where i.order.client.name = 'Reply' ")
    List<Invoice> findReplyInvoices();

    @Query("Select i from Invoice i where i.date > '2019-12-31'")
    List<Invoice> findAfter2019();
}
