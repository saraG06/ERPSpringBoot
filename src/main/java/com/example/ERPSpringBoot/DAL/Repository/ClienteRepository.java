package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
