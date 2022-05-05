package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.response.ClientResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.ClientRequestMapper;
import it.unikey.BLL.mapper.implementation.request.ContactRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.BLL.mapper.implementation.response.ClientResponseMapper;
import it.unikey.BLL.service.abstraction.ClientService;
import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.DAL.Entity.Client;
import it.unikey.DAL.Entity.Contact;
import it.unikey.DAL.Entity.Order;
import it.unikey.DAL.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImplementation implements ClientService {

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
    public ClientResponseDTO findById(Long id) throws IdNotFoundException {
        Client c = null;
        if (clientRepository.findById(id).isPresent()) {
            c = clientRepository.findById(id).get();
        }
        if(c == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return clientResponseMapper.asDto(c);
        }
    }

    @Override
    public void deleteClientById(Long id) throws IdNotFoundException {
        if(clientRepository.findById(id).isPresent()) {
            Client c = clientRepository.findById(id).get();
            if (c != null) {
                clientRepository.delete(c);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<ClientResponseDTO> findAllClients() {
        return clientResponseMapper.asDTOList(clientRepository.findAll());
    }
}
