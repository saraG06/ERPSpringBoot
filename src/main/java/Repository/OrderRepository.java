package Repository;

import Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllById(Long id);
    List<Order> findAllByDate(LocalDate date);
    List<Order> findAllByClient(Client client);
    List<Order> findAllByInvoice(Invoice invoice);
    List<Order> findAllByCollaborator(Collaborator collaborator);
    List<Order> findAllByEmployee(Employee employee);

}
