package BLL.service.astratti;

import BLL.dto.request.AziendaRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.DipendenteResponseDTO;

import java.util.List;

public interface AziendaService {
    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);
    AziendaResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<AziendaResponseDTO> findAllAziende();
    List<AziendaResponseDTO> findDipendentiTotali();
    List<AziendaResponseDTO> findDipendentiAzienda();
}