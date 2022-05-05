package DAL.Repository;

import DAL.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query(value= "SELECT * FROM cliente cl WHERE cl.listaContatti.size > 10", nativeQuery = true)
    List<Cliente> clienti10Contatti();
}
