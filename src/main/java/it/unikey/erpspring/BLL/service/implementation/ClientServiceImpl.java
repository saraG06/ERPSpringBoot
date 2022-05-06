package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
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
    public List<ClientResponseDTO> clientsContactGreater10() {
        return null;
    }

    @Override
    public void saveClient(ClientRequestDTO clientRequestDTO) {

        Client c = clientRequestMapper.asEntity(clientRequestDTO);
        clientRepository.save(c);
    }

    @Override
    public ClientResponseDTO findById(Long id) throws NullPointerException {
        Client c = clientRepository.getById(id);

        if (id != null) {
            return clientResponseMapper.asDTO(c);
        } else throw new NullPointerException();
    }
}
