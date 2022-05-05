package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
