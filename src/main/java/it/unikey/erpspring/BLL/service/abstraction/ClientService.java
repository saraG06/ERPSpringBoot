package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;

import java.util.List;

public interface ClientService {

    void saveClient(ClientRequestDTO clientRequestDTO);

    ClientResponseDTO getClientById(Long id) throws EntityNotFoundException, EntityNotFoundException;

    void deleteClientById(Long id) throws EntityNotFoundException;

    List<ClientResponseDTO> getAllClient();

    List<ClientResponseDTO> clientsContactGreater10();





}
