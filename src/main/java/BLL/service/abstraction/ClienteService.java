package BLL.service.abstraction;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface ClienteService {
    void saveCliente(ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO findById(Long id) ;
    void deleteClienteById(Long id) ;
    List<ClienteResponseDTO> findAllCliente();
}
