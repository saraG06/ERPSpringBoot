package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.CollaboratoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);

    CollaboratoreResponseDTO findById(Long id);

    void deleteById(Long id);

    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
