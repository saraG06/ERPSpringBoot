package BLL.service.abstraction;

import BLL.dto.request.OperatoreRequestDTO;
import BLL.dto.response.OperatoreResponseDTO;
import BLL.dto.response.OrdineResponseDTO;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);
    OperatoreResponseDTO findById(Long id) ;
    void deleteOperatoreById(Long id) ;
    List<OperatoreResponseDTO> findAllOperatore();
}
