package com.example.erpspring.DAL.Repository;

import com.example.erpspring.DAL.Entity.persone.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto,Long> {
}
