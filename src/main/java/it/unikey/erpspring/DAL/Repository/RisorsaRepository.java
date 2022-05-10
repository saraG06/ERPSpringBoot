package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Dipendente;
import it.unikey.erpspring.DAL.Entity.Risorsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RisorsaRepository extends JpaRepository<Risorsa,Long> {

    @Query(value = "INSERT INTO risorsa r VALUES risorsa",nativeQuery = true)
    void assegnaRisorsa(@Param("capo")Dipendente capo,@Param("dipendente") Dipendente dipendente,@Param("risorsa") Dipendente risorsa);

}
