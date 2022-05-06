package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.RisorseResponseDTO;

import java.util.List;

public interface RisorsaService {
    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);
    RisorseResponseDTO findById(Long id);
    void deleteRisorsaById (Long id);
    List<RisorseResponseDTO> findAllRisorsa();
}
