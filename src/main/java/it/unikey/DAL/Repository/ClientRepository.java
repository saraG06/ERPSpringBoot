package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Client;
import it.unikey.DAL.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("Select c From Client c where c.contacts.size >= 10")
    List<Client> findContatcsGreaterThan10();
}
