package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.DipendenteRequestDTO;
import com.example.erpspring.BLL.dto.response.DipendenteResponseDTO;
import com.example.erpspring.DAL.Entity.Enum.Risorse;

import java.util.List;

public interface DipendenteService {
    void saveDipendete(DipendenteRequestDTO dipendenteRequestDTO);
    DipendenteResponseDTO findById(Long id) ;
    void deleteDipendenteById(Long id) ;
    List<DipendenteResponseDTO> findAllDipendente();

    List<DipendenteResponseDTO> findDipendentiAuto(Risorse auto);
}
