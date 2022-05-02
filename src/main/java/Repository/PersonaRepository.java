package Repository;

import Entity.Persona;
import org.hibernate.annotations.NamedNativeQueries;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

    List<Persona> findAllByNome(String nome);
/*
    @Query(value = "SELECT p.nome FROM persona p",nativeQuery = true)
    List<String> queryPersonalizzata();

    @Query(value = "SELECT * FROM persona WHERE nome=:nome",nativeQuery = true)
    List<Persona> queryPersonalizzata2(@Param("nome") String nome);

    @Query(value = "SELECT p FROM Persona p WHERE p.nome=:nome") // Java Persistence Query Language [JPQL] linguaggio per scrivere le query
    List<Persona> customQuery(@Param("nome") String nome);

 */


}
