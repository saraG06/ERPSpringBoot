package com.example.erpspring.DAL.Repository;

import com.example.erpspring.DAL.Entity.persone.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratoreRepository extends JpaRepository<Collaboratore,Long> {
}
