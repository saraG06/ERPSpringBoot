package BLL.service.abstraction;

import BLL.dto.Request.CollaboratoreRequestDTO;
import BLL.dto.Response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);

    CollaboratoreResponseDTO findById(Long id);

    void deleteCollaboratoreById (Long id);

    List<CollaboratoreResponseDTO> findAllPersona();
}
