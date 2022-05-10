package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.ClientRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.ClientResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientServiceImpl implements ClientService{

    private final ClientRequestMapper clientRequestMapper;
    private final ClientResponseMapper clientResponseMapper;
    private final ClientRepository clientRepository;

    @Override
    public List<ClientResponseDTO> findClientsWithMoreThan10Contacts() {
        List<Client> lista = clientRepository.findClientsWithMoreThan10Contacts();
        return clientResponseMapper.asDTOList(lista);
    }

    @Override
    public List<ClientResponseDTO> clientsConctactGreater10() {
        List<Client> lista = clientRepository.clientsConctactGreater10();
        return clientResponseMapper.asDTOList(lista);
    }

    @Override
    public void saveClient(ClientRequestDTO clientRequestDTO) {
        Client c = clientRequestMapper.asEntity(clientRequestDTO);
        clientRepository.save(c);
    }

    @Override
    public ClientResponseDTO getById(Long id) {
        Client c = clientRepository.getById(id);

        if (id != null) {
            return clientResponseMapper.asDTO(c);
        } else throw new EntityNotFoundException("Entity not found");
    }


}
