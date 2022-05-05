package BLL.service.abstraction;

import BLL.mapper.dto.request.CollaboratoreRequestDTO;
import BLL.mapper.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);

    CollaboratoreResponseDTO findById(Long id);

    void deleteById(Long id);

    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
