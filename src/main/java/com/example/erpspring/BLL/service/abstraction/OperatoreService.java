package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.BLL.dto.response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);
    OperatoreResponseDTO findById(Long id) ;
    void deleteOperatoreById(Long id) ;
    List<OperatoreResponseDTO> findAllOperatore();

}
