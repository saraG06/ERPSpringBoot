package com.example.ERPSpringBoot.DAL.Repository;

import com.example.ERPSpringBoot.DAL.Entity.Cliente;
import com.example.ERPSpringBoot.DAL.Entity.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query(value = "SELECT * FROM Cliente c WHERE c.contatto.size > 10", nativeQuery = true)
    List<Cliente> contattoMaggiore10();
}
