package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.FatturaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.FatturaResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface FatturaService {
    void saveFattura (FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<FatturaResponseDTO> findAllFattura();
}
