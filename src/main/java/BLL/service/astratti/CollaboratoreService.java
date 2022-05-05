package BLL.service.astratti;



import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {
    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);
    CollaboratoreResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<CollaboratoreResponseDTO> findAllCollaboratori();
}
