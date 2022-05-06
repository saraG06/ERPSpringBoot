package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("Select e from Employee e where e.resource = 'car' ")
    List<Employee> findEmployeeListWithCar();

    @Query(value = "Select e from Employee e where e.dateOfEmployment < CURRENT_DATE - 30 ",nativeQuery = true)
    List<Employee> findEmployeeHiredLastMonth();
}
