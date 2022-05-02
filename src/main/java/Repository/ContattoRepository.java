package Repository;

import Entity.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContattoRepository extends JpaRepository {

    List<Contatto> findAllById(Long id);
    List<Contatto> findAllByName(String name);
    List<Contatto> findAllByLastname(String lastname);
    List<Contatto> findAllByBirth(LocalDate birth);
}
