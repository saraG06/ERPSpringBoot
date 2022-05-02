package Repository;

import Entity.Worker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface WorkerRepository {

    List<Worker> findallByNome(String nome);

    //@Query(value = "SELECT w from Worker w where w.name=:name")



}
