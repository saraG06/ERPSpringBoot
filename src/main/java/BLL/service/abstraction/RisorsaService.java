package BLL.service.abstraction;

import BLL.dto.Request.RisorsaRequestDTO;
import BLL.dto.Response.RisorsaResponseDTO;

import java.util.List;

public interface RisorsaService {

    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);

    RisorsaResponseDTO findById(Long id);

    void deleteRisorsaById (Long id);

    List<RisorsaResponseDTO> findAllRisorsa();
}
