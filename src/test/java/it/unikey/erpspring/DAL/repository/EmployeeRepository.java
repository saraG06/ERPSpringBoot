package it.unikey.erpspring.DAL.repository;


import it.unikey.erpspring.DAL.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e FROM Employee e JOIN Risorsa r where e.id = r.employee.id AND r.assignedResources = 'CAR'")
    List<Employee> getEmployeeWithCar();






}
