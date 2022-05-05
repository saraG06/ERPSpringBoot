package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface CollaboratorService {
    void saveCollaborator (CollaboratorRequestDTO collaboratorRequestDTO);
    CollaboratorResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteCollaboratorById(Long id) throws IdNotFoundException;
    List<CollaboratorResponseDTO> findAllCollaborators();
}
