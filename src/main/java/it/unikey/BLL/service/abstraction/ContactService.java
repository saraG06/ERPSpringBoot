package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.ContactRequestDTO;
import it.unikey.BLL.dto.response.ContactResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface ContactService {
    void saveContact (ContactRequestDTO contactRequestDTO);
    ContactResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteContactById(Long id) throws IdNotFoundException;
    List<ContactResponseDTO> findAllContacts();
}
