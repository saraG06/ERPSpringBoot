package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "Select o from Order o left join Invoice i where o.invoice = null", nativeQuery = true)
    List<Order> findOrdineWithoutInvoice();
}
