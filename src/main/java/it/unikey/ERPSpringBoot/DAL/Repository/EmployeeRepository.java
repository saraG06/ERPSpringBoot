package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.DAL.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e FROM Employee e JOIN Resource  r where e.id = r.employee.id AND r.assignedResource='CAR'")
    List<Employee> getEmployeeWithCar();

    //@Query(value= "SELECT * FROM employee  WHERE role = 'OPERATOR' AND DATEDIFF(day, GETDATE(), hiringDate)<30", nativeQuery = true)
   // List<Employee> getEmployeeWithCar();



}
