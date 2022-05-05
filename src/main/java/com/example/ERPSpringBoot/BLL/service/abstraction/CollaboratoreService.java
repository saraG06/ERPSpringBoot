package com.example.ERPSpringBoot.BLL.service.abstraction;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;

import java.util.List;

public interface CollaboratoreService {
    void saveCollaboratore (CollaboratoreRequestDTO collaboratoreRequestDTO);
    CollaboratoreResponseDTO findByid(Long id) throws IdNotFound;
    void deleteByid(Long id) throws IdNotFound;
    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
