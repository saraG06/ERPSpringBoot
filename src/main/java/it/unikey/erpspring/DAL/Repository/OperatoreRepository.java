package it.unikey.erpspring.DAL.Repository;

import it.unikey.erpspring.DAL.Entity.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore,Long> {
}
