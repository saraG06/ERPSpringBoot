package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Contact;
import it.unikey.erp_springboot.DAL.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query(value = "SELECT * FROM invoice INNER JOIN contact ON invoice.contact = contact.id WHERE company=:company AND client.id = company.client", nativeQuery = true)
    List<Invoice> getClientInvoices(@Param("company") Company company);
}
