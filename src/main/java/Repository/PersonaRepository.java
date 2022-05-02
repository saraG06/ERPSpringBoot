package Repository;

import Entity.Persona;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository  extends JpaRepository<Persona,Long> {
    List<Persona> findAllByNome(String nome);
@Query(value = "SELECT p from Persona p where p.nome=? 1 and p.id=?2")
    List<Persona> vogliocercare3nomi( String nome, Long id);

    @Query(value = "SELECT p from Persona p where p.nome=: nome")
    List<Persona> vogliocercare3nomi(@Param("nome") String nome);


}
