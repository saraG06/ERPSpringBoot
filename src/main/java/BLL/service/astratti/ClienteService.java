package BLL.service.astratti;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {
    void saveCliente(ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<ClienteResponseDTO> findAllClienti();
    List<ClienteResponseDTO> clientiCon10Contatti();
}
