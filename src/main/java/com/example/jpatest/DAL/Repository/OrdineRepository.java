package com.example.jpatest.DAL.Repository;

import com.example.jpatest.DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Long> {
}
