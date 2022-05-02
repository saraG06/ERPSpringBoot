package Repository;

import Entity.Contact;
import Entity.Invoice;
import Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findAllById(Long id);
    List<Invoice> findAllByContact(Contact contact);
    List<Invoice> findAllByOrder(Order order);
    List<Invoice> findAllByDate(LocalDate date);
}
