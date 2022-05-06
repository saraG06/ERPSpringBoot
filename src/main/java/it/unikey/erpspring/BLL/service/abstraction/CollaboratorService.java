package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;

public interface CollaboratorService {

    void saveCollaborator (CollaboratorRequestDTO collaboratorRequestDTO);

    CollaboratorResponseDTO findById(Long id);
}
