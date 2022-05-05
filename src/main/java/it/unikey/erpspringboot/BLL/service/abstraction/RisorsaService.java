package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.RisorsaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RisorsaResponseDTO;

import java.util.List;

public interface RisorsaService {

    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);

    RisorsaResponseDTO findById(Long id);

    void deleteRisorsaById (Long id);

    List<RisorsaResponseDTO> findAllRisorsa();
}
