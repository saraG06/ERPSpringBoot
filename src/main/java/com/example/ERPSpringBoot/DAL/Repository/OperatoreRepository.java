package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Dipendente;
import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {
    @Query(value = "SELECT * FROM Dipendente d WHERE d.assunzione.getMonth() = :now.getMonth() AND d.assunzione.getYear() = :now.getYear()", nativeQuery = true)
    List<Operatore> operatorLastMonth(@Param("now")LocalDate now);
}
