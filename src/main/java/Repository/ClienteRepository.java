package Repository;

import Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAllById(Long id);
    List<Cliente> findAllByName(String nome);
    List<Cliente> findAllByPartitaIVA(String pIva);
}
