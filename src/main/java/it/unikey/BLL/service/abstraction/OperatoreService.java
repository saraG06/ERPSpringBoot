package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.OperatoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    OperatoreResponseDTO findById(Long id);

    void deleteById(Long id);

    List<OperatoreResponseDTO> findAllOperatore();

    Long contaOperatori();

}
