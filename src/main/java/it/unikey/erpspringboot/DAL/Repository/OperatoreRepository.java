package it.unikey.erpspringboot.DAL.Repository;

import it.unikey.erpspringboot.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {

    //trovare tutti gli Operator che sono stati assunti nell ultimo mese
    @Query("SELECT d.operatore FROM Dipendente d WHERE d.assunzione=:now")
    List<Operatore> getAllAssuntiUltimoMese(@Param("now") LocalDate now);




}
