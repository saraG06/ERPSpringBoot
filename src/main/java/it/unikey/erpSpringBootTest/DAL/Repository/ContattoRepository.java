package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContattoRepository extends JpaRepository<Contatto, Long> {
}
