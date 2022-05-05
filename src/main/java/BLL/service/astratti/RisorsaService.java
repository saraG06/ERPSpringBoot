package BLL.service.astratti;

import BLL.dto.request.RisorsaRequestDTO;
import BLL.dto.response.RisorseResponseDTO;

import java.util.List;

public interface RisorsaService {
    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);
    RisorseResponseDTO findById(Long id);
    void deleteRisorsaById (Long id);
    List<RisorseResponseDTO> findAllRisorsa();
}
