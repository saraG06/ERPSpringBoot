package BLL.service.abstraction;

import BLL.mapper.dto.request.OperatoreRequestDTO;
import BLL.mapper.dto.response.OperatoreResponseDTO;
import DAL.Entity.Ordine;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    OperatoreResponseDTO findById(Long id);

    void deleteById(Long id);

    List<OperatoreResponseDTO> findAllOperatore();

}
