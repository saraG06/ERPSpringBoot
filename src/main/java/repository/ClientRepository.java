package repository;

import entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "select c from Client c where c.contacts.size > 10")
    List<Client> findClientsWithMoreThan10Contacts();
}
