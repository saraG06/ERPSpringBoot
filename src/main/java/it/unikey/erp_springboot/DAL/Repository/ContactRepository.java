package it.unikey.erp_springboot.DAL.Repository;

import it.unikey.erp_springboot.DAL.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findAllById(Long id);
    List<Contact> findAllByName(String name);
    List<Contact> findAllByLastname(String lastname);
    List<Contact> findAllByBirth(LocalDate birth);

}