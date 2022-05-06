package com.example.erpspring.BLL.service.abstraction;

import com.example.erpspring.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.erpspring.BLL.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);
    CollaboratoreResponseDTO findById(Long id) ;
    void deleteCollaboratoreById(Long id) ;
    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
