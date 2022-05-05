package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.ClienteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ClienteResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface ClienteService {
    void saveCliente (ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<ClienteResponseDTO> findAllCliente();
}
