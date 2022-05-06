package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.DipendenteRequestDTO;
import it.unikey.erpspring.BLL.dto.response.DipendenteResponseDTO;

import java.util.List;

public interface DipendenteService {
    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);
    DipendenteResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<DipendenteResponseDTO> findAllDipendenti();
    List<DipendenteResponseDTO> dipendentiConRisorse();

}
