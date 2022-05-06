package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda, Long> {
    @Query(value="SELECT COUNT(*) FROM Azienda a, Dipendente d WHERE d.azienda = a.id", nativeQuery = true)
    Integer nDipendenti();
}
