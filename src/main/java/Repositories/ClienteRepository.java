package Repositories;

import Entities.Cliente;
import Entities.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAllByAzienda();
}
