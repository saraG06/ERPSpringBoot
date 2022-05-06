package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.BLL.dto.request.ClientRequestDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllById(Long id);
    List<Client> findAllByName(String name);
    List<Client> findAllByIVA(String Iva);


    @Query(value = "SELECT p FROM Client p WHERE p.contacts.size>10")
    List<Client> clientsContactGreater10();

}

//nelle repository i metodi ritornano entità
//nei service tornano dto
//nei controller tornano ResponseEntity che contengono dei Dto