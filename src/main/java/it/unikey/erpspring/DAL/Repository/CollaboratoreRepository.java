package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Collaboratore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratoreRepository extends JpaRepository<Collaboratore,Long> {
}
