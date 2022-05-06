package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpspring.BLL.dto.response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {
    void saveCliente(ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<ClienteResponseDTO> findAllClienti();
    List<ClienteResponseDTO> clientiCon10Contatti();
}
