package Repository;

import Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContactRepository extends JpaRepository {

    List<Contact>findAllById(Long id);
    List<Contact>findAllByName(String name);
    List<Contact>findAllByLastName (String lastname);
    List<Contact> findAllByBirth(LocalDate birth);


}
