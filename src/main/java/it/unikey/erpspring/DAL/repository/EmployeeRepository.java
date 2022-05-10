package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    LocalDate oggi = LocalDate.now();
    LocalDate mese = LocalDate.now().minusDays(30);

    @Query(value = "SELECT e FROM Employee e JOIN Resource r WHERE e.id = r.employee.id AND r.assignedResource = 'CAR'")
    List<Employee> getEmployeeWithCar();


    @Query(value = "SELECT * FROM employee WHERE role = 'OPERATOR' AND DATEDIFF(day, GETDATE(), hiringDate) <30", nativeQuery = true)
    public List<Employee> getAllLastMonth();


}

