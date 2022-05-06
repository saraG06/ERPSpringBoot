package it.unikey.ERPSpringBoot.DAL.Repository;

import it.unikey.ERPSpringBoot.DAL.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact>findAllById(Long id);
    List<Contact>findAllByName(String name);
    List<Contact>findAllByLastname(String lastname);
    List<Contact> findAllByBirthdate(LocalDate birth);


}
