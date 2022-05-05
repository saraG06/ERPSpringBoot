package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.ContactRequestDTO;
import it.unikey.BLL.dto.response.ContactResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.ClientRequestMapper;
import it.unikey.BLL.mapper.implementation.request.ContactRequestMapper;
import it.unikey.BLL.mapper.implementation.request.InvoiceRequestMapper;
import it.unikey.BLL.mapper.implementation.response.ContactResponseMapper;
import it.unikey.BLL.service.abstraction.ContactService;
import it.unikey.DAL.Entity.Client;
import it.unikey.DAL.Entity.Contact;
import it.unikey.DAL.Entity.Invoice;
import it.unikey.DAL.Repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImplementation implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactRequestMapper contactRequestMapper;
    private final ContactResponseMapper contactResponseMapper;
    private final ClientRequestMapper clientRequestMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;

    @Override
    public void saveContact(ContactRequestDTO contactRequestDTO) {
        Contact c = contactRequestMapper.asEntity(contactRequestDTO);
        Client cl = clientRequestMapper.asEntity(contactRequestDTO.getClientRequestDTO());
        List<Invoice> invoicesList = invoiceRequestMapper.asEntityList(contactRequestDTO.getInvoiceRequestDTOList());
        c.setInvoices(invoicesList);
        contactRepository.save(c);
    }

    @Override
    public ContactResponseDTO findById(Long id) throws IdNotFoundException {
        Contact c = null;
        if (contactRepository.findById(id).isPresent()) {
            c = contactRepository.findById(id).get();
        }
        if(c == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return contactResponseMapper.asDto(c);
        }
    }

    @Override
    public void deleteContactById(Long id) throws IdNotFoundException {
        if(contactRepository.findById(id).isPresent()) {
            Contact c = contactRepository.findById(id).get();
            if (c != null) {
                contactRepository.delete(c);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<ContactResponseDTO> findAllContacts() {
        return contactResponseMapper.asDTOList(contactRepository.findAll());
    }
}
