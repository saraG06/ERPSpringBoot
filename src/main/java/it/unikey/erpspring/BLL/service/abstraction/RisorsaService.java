package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.RisorsaResponseDTO;

import java.util.List;


public interface RisorsaService {

    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);

    RisorsaResponseDTO getRisorsaById(Long id);

    void deleteRisorsaById(Long id);

    List<RisorsaResponseDTO> getAllRisorsa();


}
