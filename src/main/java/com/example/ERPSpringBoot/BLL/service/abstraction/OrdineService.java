package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.OrdineRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OrdineResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface OrdineService {
    void saveOrdine (OrdineRequestDTO ordineRequestDTO);
    OrdineResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<OrdineResponseDTO> findAllOrdine();
}
