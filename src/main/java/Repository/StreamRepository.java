package Repository;

import Entity.Employee;
import Entity.Invoice;
import Entity.Order;
import Entity.Streams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreamRepository extends JpaRepository {

    List<Streams>findAllById(Long id);
    List<Streams>findAllByOrders(Order order);
    List<Streams>findAllByEmployee(Employee employee);
    List<Streams>findAllByInvoices(Invoice invoice);


}
