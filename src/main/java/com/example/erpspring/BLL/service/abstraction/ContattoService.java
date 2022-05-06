package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);
    ContattoResponseDTO findById(Long id) ;
    void deleteContattoById(Long id) ;
    List<ContattoResponseDTO> findAllContatto();
}
