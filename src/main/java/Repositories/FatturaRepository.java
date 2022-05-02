package Repositories;

import Entities.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FatturaRepository extends JpaRepository<Fattura, Long> {

    List<Fattura> findAllByAzienda();
}
