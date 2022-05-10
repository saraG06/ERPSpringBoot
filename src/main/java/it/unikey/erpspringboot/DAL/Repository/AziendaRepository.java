package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda,Long> {
  //  @Query("SELECT a FROM Azienda a WHERE a.nome=:nome")
   // Azienda findByNome(@Param("nome") String nome);
}
