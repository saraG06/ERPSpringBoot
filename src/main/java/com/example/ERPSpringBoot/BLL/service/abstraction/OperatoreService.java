package com.example.ERPSpringBoot.BLL.service.abstraction;


import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface OperatoreService {
    void saveOperatore (OperatoreRequestDTO operatoreRequestDTO);
    OperatoreResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<OperatoreResponseDTO> findAllOperatore();
    List<OperatoreResponseDTO> operatorLastMonth(LocalDate now);
}
