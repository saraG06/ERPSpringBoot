package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.AziendaRequestDTO;
import com.example.erpspring.BLL.dto.response.AziendaResponseDTO;

import java.util.List;

public interface AziendaService {
    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);

    AziendaResponseDTO findById(Long id);


    void deleteById(Long id);

    List<AziendaResponseDTO> findAllAzienda();
}
