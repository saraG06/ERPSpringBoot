package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.AziendaRequestDTO;
import it.unikey.BLL.mapper.dto.response.AziendaResponseDTO;

import java.util.List;

public interface AziendaService {

    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);

    AziendaResponseDTO findById(Long id);

    void deleteById(Long id);

    List<AziendaResponseDTO> findAllAzienda();

    Integer numeroDipendenti();
}
