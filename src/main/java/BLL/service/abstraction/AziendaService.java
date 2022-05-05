package BLL.service.abstraction;

import BLL.dto.Request.AziendaRequestDTO;
import BLL.dto.Response.AziendaResponseDTO;

import java.util.List;

public interface AziendaService {

    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);

    AziendaResponseDTO findById(Long id);

    void deleteAziendaById (Long id);

    List<AziendaResponseDTO> findAllAzienda();
}
