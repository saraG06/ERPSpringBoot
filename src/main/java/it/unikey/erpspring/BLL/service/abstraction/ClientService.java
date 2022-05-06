package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;


import java.util.List;

public interface ClientService {

    List<ClientResponseDTO> getClientsContactGreater10();

    void saveClient(ClientRequestDTO clientRequestDTO);

    ClientResponseDTO findClientById(Long id);
}
