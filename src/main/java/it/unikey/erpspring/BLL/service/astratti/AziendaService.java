package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.AziendaResponseDTO;

import java.util.List;

public interface AziendaService {
    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);
    AziendaResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<AziendaResponseDTO> findAllAziende();
    List<AziendaResponseDTO> findDipendentiTotali();
    List<AziendaResponseDTO> findDipendentiAzienda();
}
