package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.AziendaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;

import java.util.List;

public interface AziendaService {

    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);

    AziendaResponseDTO findById(Long id);

    void deleteAziendaById (Long id);

    List<AziendaResponseDTO> findAllAzienda();
}
