package BLL.service.abstraction;

import BLL.mapper.dto.request.RisorsaRequestDTO;
import BLL.mapper.dto.response.RisorsaResponseDTO;

import java.util.List;

public interface RisorsaService {

    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);

    RisorsaResponseDTO findById(Long id);

    void deleteById(Long id);

    List<RisorsaResponseDTO> findAllRisorsa();
}
