package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.ContattoRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ContattoResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface ContattoService {
    void saveContatto (ContattoRequestDTO contattoRequestDTO);
    ContattoResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<ContattoResponseDTO> findAllContatto();
}
