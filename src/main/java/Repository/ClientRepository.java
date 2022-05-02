package Repository;

import Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllById(Long id);
    List<Client> findAllByName(String name);
    List<Client> findAllByIVA(String Iva);

}
