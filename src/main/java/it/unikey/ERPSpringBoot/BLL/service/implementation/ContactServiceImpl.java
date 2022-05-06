package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.ContactRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ContactResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.ContactService;
import it.unikey.ERPSpringBoot.DAL.Entity.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    @Override
    public List<Contact> findAllById(Long id) {
        return null;
    }

    @Override
    public List<Contact> findAllByName(String name) {
        return null;
    }

    @Override
    public List<Contact> findAllByLastName(String lastname) {
        return null;
    }

    @Override
    public List<Contact> findAllByBirth(LocalDate birth) {
        return null;
    }

    @Override
    public void save(ContactRequestDto contactRequestDto) {

    }

    @Override
    public ContactResponseDto getById(Long id) {
        return null;
    }
}
