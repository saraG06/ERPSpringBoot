package it.unikey.erpspring.BLL.service.implementation;


import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ClientResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ContactRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.ClientRepository;
import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientRequestMapper clientRequestMapper;
    private final ClientResponseMapper clientResponseMapper;
    private final ContactRequestMapper contactRequestMapper;
    private final OrderRequestMapper orderRequestMapper;

    @Override
    public void saveClient(ClientRequestDTO clientRequestDTO) {
        Client c = clientRequestMapper.asEntity(clientRequestDTO);
        List<Order> orderList = orderRequestMapper.asEntityList(clientRequestDTO.getOrderRequestDTOList());
        List<Contact> contactList = contactRequestMapper.asEntityList(clientRequestDTO.getContactRequestDTOList());
        c.setOrders(orderList);
        c.setContacts(contactList);
        clientRepository.save(c);
    }

    @Override
    public ClientResponseDTO getClientById(Long id) throws EntityNotFoundException {
        Client c = null;
        if (clientRepository.findById(id).isPresent()) {
            c = clientRepository.findById(id).get();
        }
        if(c == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return clientResponseMapper.asDTO(c);
        }
    }

    @Override
    public void deleteClientById(Long id) throws EntityNotFoundException {
        if(clientRepository.findById(id).isPresent()) {
            Client c = clientRepository.findById(id).get();
            if (c != null) {
                clientRepository.delete(c);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<ClientResponseDTO> getAllClient() {
        return clientResponseMapper.asDTOList(clientRepository.findAll());
    }

    @Override
    public List<ClientResponseDTO> clientsContactGreater10() {
        return clientResponseMapper.asDTOList((clientRepository.clientsContactGreater10()));
    }
}

