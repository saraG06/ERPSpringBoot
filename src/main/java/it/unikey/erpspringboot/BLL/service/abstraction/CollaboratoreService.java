package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.CollaboratoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);

    CollaboratoreResponseDTO findById(Long id);

    void deleteCollaboratoreById (Long id);

    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
