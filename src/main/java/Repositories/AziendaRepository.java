package Repositories;

import Entities.Azienda;
import Entities.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AziendaRepository extends JpaRepository<Azienda, Long> {
}
