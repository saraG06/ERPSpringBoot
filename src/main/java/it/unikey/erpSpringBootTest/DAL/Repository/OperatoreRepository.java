package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatoreRepository extends JpaRepository<Operatore, Long> {
}