package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura, Long> {
}
