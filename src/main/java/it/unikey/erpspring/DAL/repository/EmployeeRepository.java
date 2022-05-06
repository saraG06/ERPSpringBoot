package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e FROM Employee e JOIN Resource r WHERE e.id = r.employee.id AND r.assignedResource = 'CAR'")
    List<Employee> getEmployeesWithCar();

    //@Query(value = "SELECT e FROM Employee e WHERE CAST(month(e.hiringDate) as int)  >  ")
    @Query(value = "SELECT * FROM employee WHERE role = 'OPERATOR' AND DATEDIFF(day,GETDATE(), hiring_date) < 30", nativeQuery = true)
    List<Employee> getOperatorsHiredLastMonth();
}
