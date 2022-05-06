package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
    @Query(value = "SELECT * FROM Dipendente d WHERE d.risorsa LIKE 'MACCHINA'", nativeQuery = true)
    List<Dipendente> dipendeteMacchina();
}
