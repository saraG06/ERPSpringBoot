package Repositories;

import Entities.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
    List<Ordine> findAllByAzienda();
}
