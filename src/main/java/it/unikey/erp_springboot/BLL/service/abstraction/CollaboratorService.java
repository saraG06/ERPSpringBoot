package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CollaboratorResponseDTO;

import java.util.List;

public interface CollaboratorService {

    void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO);

    CollaboratorResponseDTO findById(Long id);

    void deleteCollaboratorById(Long id);

    List<CollaboratorResponseDTO> findAllCollaborator();
}
