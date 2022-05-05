package BLL.service.abstraction;

import BLL.dto.Request.DipendenteRequestDTO;
import BLL.dto.Response.DipendenteResponseDTO;

import java.util.List;

public interface DipendenteService {

    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);

    DipendenteResponseDTO findById(Long id);

    void deleteDipendenteById (Long id);

    List<DipendenteResponseDTO> findAllDipendente();
}
