package Repository;

import Entity.Client;
import Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository {
    List<Order>findAllById(Long Id);
    List<Order> findAllByDate(LocalDate date);
    List<Order>findAllCient(Client client);

}
