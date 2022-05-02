package Repositories;

import Entities.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatoreRepository extends JpaRepository<Operatore, Long> {
    List<Operatore> countAll();
}
