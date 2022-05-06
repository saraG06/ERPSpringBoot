package DAL.Repository;

import BLL.Entity.Azienda;
import BLL.Entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda,Long> {

    // linguaggio jpql,andiamo a sfruttare gli oggetti(entità ed attributi)
    /*@Query("SELECT p FROM Persona p WHERE p.nome =: nome AND p.cognome =: cognome")
    List<Persona> findByNomeAndCognome(@Param("nome") String nome,@Param("cognome") String cognome);*/

    /*@Query(value = "SELECT * FROM persona WHERE nome =: nome AND cognome =: cognome",nativeQuery = true)
    List<Persona> findByNomeAndCognome (@Param("nome") String nome,@Param("cognome") String cognome);*/

    //public Integer findByCognome5Lettere(String cognome);

    /*@Query("SELECT count(p) FROM Persona p WHERE p.cognome LIKE '_____'")
    Integer findByCognome5Lettere();*/

    //Dipendenti totali
    @Query(value = "SELECT o FROM Dipendente o where o.operatore.azienda IS NOT NULL")
    List<Dipendente> findDipendentiAzienda (@Param("id") Long id);

}
