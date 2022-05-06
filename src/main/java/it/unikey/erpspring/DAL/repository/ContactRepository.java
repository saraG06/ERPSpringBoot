package it.unikey.erpspring.DAL.repository;

import it.unikey.erpspring.DAL.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

}
