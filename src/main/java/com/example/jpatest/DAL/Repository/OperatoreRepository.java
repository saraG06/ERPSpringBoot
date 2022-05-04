package com.example.jpatest.DAL.Repository;

import com.example.jpatest.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {
}
