package Repository;

import Entity.Contatto;
import Entity.Fattura;
import Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FatturaRepository extends JpaRepository {

    List<Fattura> findAllById(Long id);
    List<Fattura> findAllByContact(Contatto contact);
    List<Fattura> findAllByOrder(Ordine order);
    List<Fattura> findAllByDate(LocalDate date);
}
