package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientRequestMapper clientRequestMapper;
    private final ClientResponseMapper clientResponseMapper;

    @Override
    public List<ClientResponseDTO> getClientsContactGreater10() {
        List<Client> c = clientRepository.getClientsContactGreater10();
        return clientResponseMapper.asDTOList(c);
    }

    @Override
    public void saveClient(ClientRequestDTO clientRequestDTO) {
        Client c = clientRequestMapper.asEntity(clientRequestDTO);
        clientRepository.save(c);
    }

    @Override
    public ClientResponseDTO findClientById(Long id) throws NullPointerException{
        Client c = clientRepository.getById(id);
        if(id != null){
            return clientResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }
}
