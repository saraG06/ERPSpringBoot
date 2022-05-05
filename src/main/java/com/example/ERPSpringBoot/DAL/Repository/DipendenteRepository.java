package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
