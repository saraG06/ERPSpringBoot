package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}
