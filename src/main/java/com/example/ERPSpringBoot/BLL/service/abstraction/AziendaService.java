package com.example.ERPSpringBoot.BLL.service.abstraction;

import com.example.ERPSpringBoot.BLL.dto.request.AziendaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.AziendaResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface AziendaService {
    void saveAzienda (AziendaRequestDTO aziendaRequestDTO);
    AziendaResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<AziendaResponseDTO> findAllAzienda();
}
