package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.DipendenteResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface DipendenteService {
    void saveDipendente (DipendenteRequestDTO dipendenteRequestDTO);
    DipendenteResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<DipendenteResponseDTO> findAllDipendente();
}
