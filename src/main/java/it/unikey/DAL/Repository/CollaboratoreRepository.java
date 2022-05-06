package it.unikey.DAL.Repository;

import it.unikey.DAL.Entity.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratoreRepository extends JpaRepository<Collaboratore, Long> {
}
