package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.DAL.Entity.Streams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends JpaRepository<Streams, Long> {



 // @Query(value = "SELECT SIZE")

}
