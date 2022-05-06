package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.BLL.dto.response.WorkerResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface WorkerRepository extends JpaRepository<Worker, Long> {

    List<WorkerResponseDto> findAllByName(String nome);

    //@Query(value = "SELECT w from Worker w where w.name=:name")



}
