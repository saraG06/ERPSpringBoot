package Repository;

import Entity.Employee;
import Entity.Streams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository {

    List<Employee>findAllByStreams(Streams stream);
}
