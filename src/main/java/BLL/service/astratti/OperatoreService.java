package BLL.service.astratti;

import BLL.dto.request.OperatoreRequestDTO;
import BLL.dto.response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {
    void saveOperatore(OperatoreRequestDTO aziendaRequestDTO);
    OperatoreResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<OperatoreResponseDTO> findAllOperatori();
}
