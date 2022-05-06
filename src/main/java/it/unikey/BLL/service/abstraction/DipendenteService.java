package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.BLL.mapper.dto.response.DipendenteResponseDTO;

import java.time.LocalDate;
import java.util.List;

public interface DipendenteService {

    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);

    DipendenteResponseDTO findById(Long id);

    void deleteById(Long id);

    List<DipendenteResponseDTO> findAllDipendente();

    List<DipendenteResponseDTO> ultimiDipendentiAssunti(LocalDate now);

    List<DipendenteResponseDTO> dipendentiConMacchina();
}
