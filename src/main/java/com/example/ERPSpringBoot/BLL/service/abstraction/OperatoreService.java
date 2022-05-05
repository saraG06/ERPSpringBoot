package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface OperatoreService {
    void saveOperatore (OperatoreRequestDTO operatoreRequestDTO);
    OperatoreResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<OperatoreResponseDTO> findAllOperatore();
}
