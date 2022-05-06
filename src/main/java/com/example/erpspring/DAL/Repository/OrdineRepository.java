package com.example.erpspring.DAL.Repository;

import com.example.erpspring.DAL.Entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine,Long>{


    @Query(value = "SELECT o FROM Fattura f ,Ordine o WHERE f.ordine = o")
    List<Ordine> ordiniFatturati();
}
