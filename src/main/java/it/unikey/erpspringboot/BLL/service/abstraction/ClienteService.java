package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.ClienteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.DAL.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    void saveCliente(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO findById(Long id);

    void deleteClienteById (Long id);

    List<ClienteResponseDTO> findAllCliente();

    List<ClienteResponseDTO> getAllClientiWith10OrMoreContatti();
}
