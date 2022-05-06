package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ContactRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ContactResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.InvoiceRequestMapper;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.repository.ContactRepository;
import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.service.abstraction.ContactService;
import it.unikey.erpspring.DAL.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

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
        c.setInvoiceList(invoicesList);
        contactRepository.save(c);
    }

    @Override
    public ContactResponseDTO getContactById(Long id) throws EntityNotFoundException {
        Contact c = null;
        if (contactRepository.findById(id).isPresent()) {
            c = contactRepository.findById(id).get();
        }
        if(c == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return contactResponseMapper.asDTO(c);
        }
    }

    @Override
    public void deleteContactById(Long id) throws EntityNotFoundException {
        if(contactRepository.findById(id).isPresent()) {
            Contact c = contactRepository.findById(id).get();
            if (c != null) {
                contactRepository.delete(c);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<ContactResponseDTO> getAllContact() {
        return contactResponseMapper.asDTOList(contactRepository.findAll());
    }
}
