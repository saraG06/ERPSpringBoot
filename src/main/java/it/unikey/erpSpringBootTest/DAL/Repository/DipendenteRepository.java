package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
    /*@Query("select d from Dipendente d where d.dataAssunzione ")
    List<Dipendente> findAllDipendentiHiredLastMonth();*/
    @Query("select d from Dipendente d where d.azienda = :azienda")
    List<Dipendente> findAllDipendentiByAzienda(@Param("azienda")Azienda azienda);
    @Query("select d from Dipendente d where d.risorse = 'macchina'")
    List<Dipendente> findAllDipendentiWithRisorsaAsMacchina();
}
