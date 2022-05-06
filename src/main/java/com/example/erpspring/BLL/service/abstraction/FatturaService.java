package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {
    void saveFattura(FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findById(Long id) ;
    void deleteFatturaById(Long id) ;
    List<FatturaResponseDTO> findAllFattura();

    public List<FatturaResponseDTO> findFattureDopo2019();
    public List<FatturaResponseDTO> findFattureReply();
}
