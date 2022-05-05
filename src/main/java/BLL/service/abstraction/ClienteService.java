package BLL.service.abstraction;

import BLL.dto.Request.ClienteRequestDTO;
import BLL.dto.Response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

    void saveCliente(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO findById(Long id);

    void deleteClienteById (Long id);

    List<ClienteResponseDTO> findAllCliente();
}
