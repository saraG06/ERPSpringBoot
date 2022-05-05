package BLL.service.abstraction;

import BLL.dto.Request.OperatoreRequestDTO;
import BLL.dto.Response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    OperatoreResponseDTO findById(Long id);

    void deleteOperatoreById (Long id);

    List<OperatoreResponseDTO> findAllOperatore();
}
