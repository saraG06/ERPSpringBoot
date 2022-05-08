package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;

import java.time.LocalDate;
import java.util.List;

public interface FatturaService {
    void saveFattura(FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findById(Long id) ;
    void deleteFatturaById(Long id) ;
    List<FatturaResponseDTO> findAllFattura();

    public List<FatturaResponseDTO> findFattureDopo2019();
    public List<FatturaResponseDTO> findFattureReply();

    public List<FatturaResponseDTO> findFattureAziendaContatto(ContattoRequestDTO c);
    public void fatturaDaContatto(ContattoRequestDTO c, OrdineRequestDTO o, LocalDate date);
}
