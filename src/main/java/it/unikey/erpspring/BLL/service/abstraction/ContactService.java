package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.DAL.entity.Contact;

import java.util.List;

public interface ContactService {

    List<InvoiceResponseDTO> getInvoiceFromClient(Contact contact);

    void saveContact (ContactRequestDTO contactRequestDTO);

    ContactResponseDTO findById (Long id);
}
