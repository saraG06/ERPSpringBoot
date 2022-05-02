package Repository;

import Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface InvoiceRepository extends JpaRepository {

    List<Invoice> findAllByDate(LocalDate date);

    List<Invoice> findAllByOrder(Order order);

    List<Invoice> findAllByContact(Contact contact);

    List<Invoice> findAllByClient(Client client);

    List<Invoice> findAllByStreams(Streams streams);


}
