package com.example.erpspring.DAL.Repository;

import com.example.erpspring.DAL.Entity.Enum.Risorse;
import com.example.erpspring.DAL.Entity.persone.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

        @Query(value = "SELECT * FROM Dipendente d WHERE d.dataAssunzione > :meseTime", nativeQuery = true)
        public List<Dipendente> dipendentiMenoDiUnMese(@Param("meseTime")LocalDate oggiMenoUnMese) ;

        @Query(value = "SELECT * FROM Dipendente d WHERE d.risorsa LIKE :risorsa", nativeQuery = true)
        public List<Dipendente> dipendentiConRisorsa(@Param("risorsa") Risorse risorsa) ;
}
