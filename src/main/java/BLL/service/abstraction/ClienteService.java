package BLL.service.abstraction;

import BLL.mapper.dto.request.ClienteRequestDTO;
import BLL.mapper.dto.response.ClienteResponseDTO;
import DAL.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    void saveCliente(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO findById(Long id);

    void deleteById(Long id);

    List<ClienteResponseDTO> findAllCliente();

    List<Cliente> clienti10Contatti();
}
