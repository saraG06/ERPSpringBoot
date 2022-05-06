package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.resource = 'car'")
    List<Employee> findByResourceCar();
    @Query(value = "SELECT * FROM employee e WHERE e.dateOfEmployment.plusDays(30) >= current_date", nativeQuery = true)
    List<Employee> findByHireLastMonth();
    List<Employee> findByCompany(Company company);
}
