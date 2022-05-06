package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ContactResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.ContactRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.ContactResponseMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.ContactService;
import it.unikey.erp_springboot.DAL.Entity.Client;
import it.unikey.erp_springboot.DAL.Entity.Contact;
import it.unikey.erp_springboot.DAL.Repository.ContactRepository;
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

    @Override
    public void saveContact(ContactRequestDTO contactRequestDTO) {
        Contact c = contactRequestMapper.asEntity(contactRequestDTO);
        Client cl = clientRequestMapper.asEntity(contactRequestDTO.getClientRequestDTO());
        c.setClient(cl);
        contactRepository.save(c);
    }

    @Override
    public ContactResponseDTO findById(Long id) {
        Contact c = contactRepository.getById(id);
        if(c != null){
            return contactResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteContactById(Long id) {
        if(contactRepository.existsById(id)){
            contactRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }

    }

    @Override
    public List<ContactResponseDTO> findAllContact() {
        List<Contact> list = contactRepository.findAll();
        return contactResponseMapper.asDTOList(list);
    }
}
