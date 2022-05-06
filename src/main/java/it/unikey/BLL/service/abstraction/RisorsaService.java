package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.Exception.LowRoleException;
import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.BLL.mapper.dto.request.RisorsaRequestDTO;
import it.unikey.BLL.mapper.dto.response.RisorsaResponseDTO;

import java.util.List;

public interface RisorsaService {

    RisorsaResponseDTO findById(Long id);

    void deleteById(Long id);

    List<RisorsaResponseDTO> findAllRisorsa();

    void assegnaRisorsa(DipendenteRequestDTO capo, DipendenteRequestDTO dip, RisorsaRequestDTO risorsaRequestDTO) throws LowRoleException;
}
