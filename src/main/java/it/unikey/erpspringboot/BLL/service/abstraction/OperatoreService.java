package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    OperatoreResponseDTO findById(Long id);

    void deleteOperatoreById (Long id);

    List<OperatoreResponseDTO> findAllOperatore();
}
