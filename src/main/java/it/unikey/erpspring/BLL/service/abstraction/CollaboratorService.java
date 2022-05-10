package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CollaboratorService {

    void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO);

    CollaboratorResponseDTO getCollaboratorById(Long id) throws EntityNotFoundException;

    void deleteCollaboratorById(Long id) throws EntityNotFoundException;

    List<CollaboratorResponseDTO> getAllCollaborator();



}
