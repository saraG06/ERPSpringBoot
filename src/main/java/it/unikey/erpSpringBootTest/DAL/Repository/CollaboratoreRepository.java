package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CollaboratoreRepository extends JpaRepository<Collaboratore, Long> {

}
