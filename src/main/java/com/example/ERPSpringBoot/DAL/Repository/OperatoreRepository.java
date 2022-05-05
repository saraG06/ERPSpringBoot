package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {
}
