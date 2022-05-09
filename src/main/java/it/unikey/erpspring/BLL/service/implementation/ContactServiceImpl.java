package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.ContactService;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactRequestMapper contactRequestMapper;
    private final ContactResponseMapper contactResponseMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;


    @Override
    public List<InvoiceResponseDTO> getInvoiceFromClient(Contact contact) {
        List<Invoice> i = contactRepository.getInvoiceFromClient(contact);
        List<InvoiceResponseDTO> i1 = invoiceResponseMapper.asDTOList(i);
        return i1;
    }

    @Override
    public void saveContact(ContactRequestDTO contactRequestDTO) {
        Contact c = contactRequestMapper.asEntity(contactRequestDTO);
        contactRepository.save(c);

    }

    @Override
    public ContactResponseDTO findById(Long id) throws NullPointerException {

        Contact c = contactRepository.getById(id);

        if (id != null) {
            return contactResponseMapper.asDTO(c);
        } else throw new NullPointerException();
    }
}
