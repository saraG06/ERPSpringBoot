package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.DipendenteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.DipendenteResponseDTO;

import java.util.List;

public interface DipendenteService {

    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);

    DipendenteResponseDTO findById(Long id);

    void deleteDipendenteById (Long id);

    List<DipendenteResponseDTO> findAllDipendente();
}
