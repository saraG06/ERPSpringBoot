package com.example.jpatest.DAL.Repository;

import com.example.jpatest.DAL.Entity.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratoreRepository extends JpaRepository<Collaboratore, Long> {
}
