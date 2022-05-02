package Repositories;

import Entities.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollaboratoreRepository extends JpaRepository<Collaboratore, Long> {

    List<Collaboratore> findAllByAzienda();
}
