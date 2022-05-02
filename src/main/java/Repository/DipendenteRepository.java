package Repository;

import Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DipendenteRepository extends JpaRepository {

    List<Persona> findAllById(Long id);
    List<Persona> findAllByName(String name);
    List<Persona> findAllByLastname(String lastname);
    List<Persona> findAllByBirth(LocalDate birth);
    List<Persona> findAllByDAtaAssunzione(LocalDate dataAssunzione);
}
