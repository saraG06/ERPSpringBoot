package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.BLL.dto.response.ClientResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface ClientService {

    void saveClient(ClientRequestDTO clientRequestDTO);

    ClientResponseDTO findById(Long id) throws IdNotFoundException;;

    void deleteClientById(Long id) throws IdNotFoundException;

    List<ClientResponseDTO> findAllClients();
}
