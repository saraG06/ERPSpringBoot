package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;

import java.util.List;

public interface ClientService {

    void saveClient(ClientRequestDTO clientRequestDTO);

    ClientResponseDTO findById(Long id);

    void deleteClientById(Long id);

    List<ClientResponseDTO> findAllClient();

    List<ClientResponseDTO> findClientWithMore10Contacts();
}
