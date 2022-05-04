package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Contact;
import it.unikey.erp_springboot.DAL.Entity.Invoice;
import it.unikey.erp_springboot.DAL.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
