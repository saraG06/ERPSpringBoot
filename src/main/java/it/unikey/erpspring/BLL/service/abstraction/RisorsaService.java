package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.RisorsaResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RisorsaService {

    void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO);

    RisorsaResponseDTO getRisorsaById(Long id) throws EntityNotFoundException;

    void deleteRisorsaById(Long id) throws EntityNotFoundException;

    List<RisorsaResponseDTO> getAllRisorsa();


}
