package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.RisorsaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.RisorsaResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface RisorsaService {
    void saveRisorsa (RisorsaRequestDTO risorsaRequestDTO);
    RisorsaResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<RisorsaResponseDTO> findAllRisorsa();
}
