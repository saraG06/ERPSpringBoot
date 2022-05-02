package Repository;

import Entity.Dipendente;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

    @Modifying
    @Query("insert into Dipentende d (d.nome, d.cognome, d.) values (:id,:description,:filepath)")
    public void insertDocumentByTaskId(@Param("id") Long id, @Param("description") String description, @Param("filepath") String filepath);
}
