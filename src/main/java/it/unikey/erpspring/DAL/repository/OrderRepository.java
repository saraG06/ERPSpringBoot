package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
