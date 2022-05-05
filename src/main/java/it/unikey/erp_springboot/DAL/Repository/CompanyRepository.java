package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Client;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
   @Query("SELECT c FROM Client c INNER JOIN Company c2 ON c.company = c2 WHERE count(c) > 10")
    List<Client> moreThan10();
   @Query("SELECT i FROM Invoice i INNER JOIN Company c ON i.company = c WHERE c.name=:name")
   List<Invoice> invoices(@Param("name") String name);
}
