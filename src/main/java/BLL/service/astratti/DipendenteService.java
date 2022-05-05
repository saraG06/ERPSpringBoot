package BLL.service.astratti;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;

import java.util.List;

public interface DipendenteService {
    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);
    DipendenteResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<DipendenteResponseDTO> findAllDipendenti();
}
