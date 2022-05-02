package Repository;

import Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda, Long> {

    List<Azienda> findAllById(Long id);
    List<Azienda> findAllByName(String name);
}
