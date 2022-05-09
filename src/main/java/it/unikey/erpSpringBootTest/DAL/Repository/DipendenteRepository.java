package it.unikey.erpSpringBootTest.DAL.Repository;

import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

    @Query("select d from Dipendente d where d.azienda = :azienda")
    List<DipendenteResponseDTO> findAllDipendentiByAzienda(@Param("azienda")Azienda azienda);
    @Query("select d from Dipendente d where d.risorse = 'macchina'")
    List<DipendenteResponseDTO> findAllDipendentiWithRisorsaAsMacchina();

    /*@Query(value = "SELECT new it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO(id, nome, cognome, data_nascita, operatore_id, data_assunzione, ruolo, risorse)" + " FROM dipendente WHERE DATEDIFF(day, data_assunzione, GETDATE()) <= 30", nativeQuery = true)
    List<DipendenteResponseDTO> findDipendentiEmployedLastMonth();*/

    @Query("update Dipendente d set d.risorse = :risorse where d.id = :id")
    void assegnaRisorsa(@Param("id") Long id,@Param("risorse")Risorse risorse);
}
