package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.ContactRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.ContactResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.InvoiceResponseMapper;
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

    private final ContactResponseDTO contactResponseDTO;
    private final ContactRequestDTO contactRequestDTO;
    private final ContactResponseMapper contactResponseMapper;
    private final ContactRequestMapper contactRequestMapper;
    private final ContactRepository contactRepository;
    private final InvoiceResponseMapper invoiceResponseMapper;

    @Override
    public List<InvoiceResponseDTO> findInvoicesFromClient(Contact contact) {
        List<Invoice> lista = contactRepository.getInvoiceFromClient(contact);
        List<InvoiceResponseDTO> lista1 = invoiceResponseMapper.asDTOList(lista);
        return lista1;
    }

    @Override
    public void saveContact(ContactRequestDTO contactRequestDTO) {
        Contact c = contactRequestMapper.asEntity(contactRequestDTO);
        contactRepository.save(c);
    }

    @Override
    public ContactResponseDTO findById(Long id) {
        Contact c = contactRepository.getById(id);

        if (id != null){
            return contactResponseMapper.asDTO(c);
        }
        else throw new NullPointerException();
    }


}
