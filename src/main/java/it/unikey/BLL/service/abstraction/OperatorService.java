package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.OperatorRequestDTO;
import it.unikey.BLL.dto.response.OperatorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface OperatorService {
    void saveOperator (OperatorRequestDTO operatorRequestDTO);
    OperatorResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteOperatorById(Long id) throws IdNotFoundException;
    List<OperatorResponseDTO> findAllOperators();
}
