package it.unikey.erpspring.BLL.service.abstraction;


import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;


import java.util.List;

public interface ContactService {


    List<InvoiceResponseDTO> getInvoicesFromClient(ContactRequestDTO contactRequestDTO);

    void saveContact(ContactRequestDTO contactRequestDTO);

    ContactResponseDTO findContactById(Long id);

    void deleteContactById(Long id);

    List<ContactResponseDTO> findAllContact();
}
