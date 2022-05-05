package BLL.service.abstraction;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.dto.response.FatturaResponseDTO;

import java.util.List;

public interface DipendenteService {
    void saveDipendete(DipendenteRequestDTO dipendenteRequestDTO);
    DipendenteResponseDTO findById(Long id) ;
    void deleteDipendenteById(Long id) ;
    List<DipendenteResponseDTO> findAllDipendente();
}
