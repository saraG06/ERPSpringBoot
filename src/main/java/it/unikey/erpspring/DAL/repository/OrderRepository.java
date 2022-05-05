package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT o FROM Order o WHERE o.invoice IS NULL")
    List<Order> getOrderWithoutInvoice();
}
