package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long> {

}
