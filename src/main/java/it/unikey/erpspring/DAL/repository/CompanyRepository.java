package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "SELECT SIZE(e.employeeList) FROM Company e")
    Integer getNumberOfEmployees();
}