package Repository;

import Entity.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {

    List<Collaborator> findAllById(Long id);
    List<Collaborator> findAllByName(String name);
    List<Collaborator> findAllByLastname(String lastname);
    List<Collaborator> findAllByBirth(LocalDate birth);
}
