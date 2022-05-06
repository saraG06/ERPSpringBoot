package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.ClienteRequestDTO;
import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

    void saveCliente(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO findById(Long id);

    void deleteById(Long id);

    List<ClienteResponseDTO> findAllCliente();

    List<ClienteResponseDTO> clienti10Contatti();
}
