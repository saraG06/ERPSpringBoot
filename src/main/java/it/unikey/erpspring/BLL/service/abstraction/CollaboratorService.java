package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;

import java.util.List;

public interface CollaboratorService {

    void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO);

    CollaboratorResponseDTO findCollaboratorById(Long id);

    void deleteCollaboratorById(Long id);

    List<CollaboratorResponseDTO> findAllCollaborator();

}
