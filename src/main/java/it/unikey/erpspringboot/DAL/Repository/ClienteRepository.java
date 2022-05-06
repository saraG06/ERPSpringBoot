package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    //trovare i clienti che hanno piu di 10 persone all 'interno dei loro contatti
    @Query("SELECT c FROM Cliente c WHERE c.contatti.size>10")
    List<Cliente> getAllClientiWith10OrMoreContatti();
}
