package Repositories;

import Entities.Collaboratore;
import Entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

    List<Dipendente> findAllByAzienda();
}
