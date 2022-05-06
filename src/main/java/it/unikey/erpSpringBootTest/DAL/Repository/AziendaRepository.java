package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AziendaRepository extends JpaRepository<Azienda, Long> {
}
