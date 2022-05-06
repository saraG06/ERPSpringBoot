package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.ClienteRequestDTO;
import com.example.erpspring.BLL.dto.response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {
    void saveCliente(ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO findById(Long id) ;
    void deleteClienteById(Long id) ;
    List<ClienteResponseDTO> findAllCliente();
}
