package DAL.Repository;

import DAL.Entity.Azienda;
import DAL.Entity.Dipendente;
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
    @Query(value = "SELECT * FROM Dipendente",nativeQuery = true)
    List<Dipendente> findDipendentiTotali (@Param("id") Long id);

    //@Query(value = "SELECT * FROM Contatto ",nativeQuery = true)
}
