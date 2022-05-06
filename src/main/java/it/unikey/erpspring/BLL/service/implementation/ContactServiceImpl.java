package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
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
    private final ClientRequestMapper clientRequestMapper;

    @Override
    public List<InvoiceResponseDTO> getInvoicesFromClient(ContactRequestDTO contactRequestDTO) {
        List<Invoice> i = contactRepository.getInvoicesFromClient(contactRequestMapper.asEntity(contactRequestDTO));
        return invoiceResponseMapper.asDTOList(i);
    }

    @Override
    public void saveContact(ContactRequestDTO contactRequestDTO) {
        Contact c = contactRequestMapper.asEntity(contactRequestDTO);
        c.setClient(clientRequestMapper.asEntity(contactRequestDTO.getClientRequestDTO()));
        contactRepository.save(c);
    }

    @Override
    public ContactResponseDTO findContactById(Long id) throws NullPointerException{
        Contact c = contactRepository.getById(id);
        if(id != null){
            return contactResponseMapper.asDTO(c);
        }else {
            throw new NullPointerException();
        }
    }
}
