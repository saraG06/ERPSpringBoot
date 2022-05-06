package DAL.Repository;

import BLL.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query(value = "SELECT e FROM Cliente e WHERE e.contattos.size > 10")
    List<Cliente> clientiCon10Contatti();

}
