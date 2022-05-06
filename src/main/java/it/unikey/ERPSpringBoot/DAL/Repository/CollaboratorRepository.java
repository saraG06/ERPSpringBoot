package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.DAL.Entity.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {

    List<Collaborator> findByNameAndLastname (String nome, String cognome);
}
