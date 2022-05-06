package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.ContactRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ContactResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Contact;

import java.time.LocalDate;
import java.util.List;

public interface ContactService {

    List<Contact> findAllById(Long id);
    List<Contact>findAllByName(String name);
    List<Contact>findAllByLastName (String lastname);
    List<Contact> findAllByBirth(LocalDate birth);
    void save (ContactRequestDto contactRequestDto);
    ContactResponseDto getById (Long id);
}
