package it.unikey.erpspring.DAL.repository;


import it.unikey.erpspring.DAL.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {



}
