package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {

}
