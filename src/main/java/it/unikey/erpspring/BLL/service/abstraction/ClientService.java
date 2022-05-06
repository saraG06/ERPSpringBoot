package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.DAL.entity.Client;

import java.util.List;

public interface ClientService {

    List<ClientResponseDTO> clientsContactGreater10();

    void saveClient (ClientRequestDTO clientRequestDTO);

    ClientResponseDTO findById(Long id);
}
