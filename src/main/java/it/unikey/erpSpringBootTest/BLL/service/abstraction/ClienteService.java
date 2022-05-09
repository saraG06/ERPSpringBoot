package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    void saveCliente(ClienteRequestDTO clienteRequestDTO);

    void deleteClienteById(Long id);

    List<ClienteResponseDTO> findAllClientiWithMoreThan10Contatti();
}
