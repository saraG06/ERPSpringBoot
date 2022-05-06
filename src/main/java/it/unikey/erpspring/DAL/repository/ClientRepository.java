package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "SELECT c FROM Client c WHERE c.contacts.size > 10")
    List<Client> getClientsContactGreater10();
}
