package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura, Long> {
    @Query(value = "SELECT * FROM Fattura f WHERE f.data > '31-12-2019'", nativeQuery = true)
    List<Fattura> fatturaAfterDate();

    @Query(value = "SELECT * FROM Fattura f WHERE f.contatto.cliente.nome LIKE :azienda", nativeQuery = true)
    List<Fattura> fatturaReply(@Param("azienda") String azienda);
}
