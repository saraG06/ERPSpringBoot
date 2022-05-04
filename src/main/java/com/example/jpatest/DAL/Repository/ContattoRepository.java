package com.example.jpatest.DAL.Repository;

import com.example.jpatest.DAL.Entity.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, Long> {
}
