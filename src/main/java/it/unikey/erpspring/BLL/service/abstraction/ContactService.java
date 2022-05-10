package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;

import java.util.List;


public interface ContactService {

    void saveContact(ContactRequestDTO contactRequestDTO);

    ContactResponseDTO getContactById(Long id) throws EntityNotFoundException;

    void deleteContactById(Long id) throws EntityNotFoundException;

    List<ContactResponseDTO> getAllContact();

}
