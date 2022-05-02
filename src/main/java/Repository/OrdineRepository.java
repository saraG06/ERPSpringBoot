package Repository;

import Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrdineRepository extends JpaRepository {

    List<Ordine> findAllById(Long id);
    List<Ordine> findAllByDate(LocalDate date);
    List<Ordine> findAllByClient(Cliente client);
    List<Ordine> findAllByInvoice(Fattura invoice);
    List<Ordine> findAllByCollaborator(Collaboratore collaborator);
    List<Ordine> findAllByEmployee(Dipendente employee);
}
