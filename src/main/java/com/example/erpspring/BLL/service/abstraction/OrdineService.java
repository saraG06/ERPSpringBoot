package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.dto.response.OrdineResponseDTO;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO autoRequestDTO);

    OrdineResponseDTO findById(Long id) ;
    void deleteOrdineById(Long id) ;
    List<OrdineResponseDTO> findAllOrdine();

    List<OrdineResponseDTO> findOrdiniSenzaFattura();
}
