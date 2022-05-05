package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ContactResponseDTO;

import java.util.List;

public interface ContactService {

    void saveContact(ContactRequestDTO contactRequestDTO);

    ContactResponseDTO findById(Long id);

    void deleteContactById(Long id);

    List<ContactResponseDTO> findAllContact();
}
