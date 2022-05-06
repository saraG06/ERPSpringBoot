package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

    @Query(value = "SELECT c.client.invoices FROM Contact c WHERE c= :contact")
    List<Invoice> getInvoiceFromClient(@Param("contact") Contact contact);
}
