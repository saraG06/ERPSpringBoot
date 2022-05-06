package com.example.erpspring.DAL.Repository;

import com.example.erpspring.DAL.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda,Long> {
}
