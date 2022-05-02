package Repository;

import Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllById(Long id);
    List<Employee> findAllByName(String name);
    List<Employee> findAllByLastname(String lastname);
    List<Employee> findAllByBirth(LocalDate birth);

}
