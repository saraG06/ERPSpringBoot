package it.unikey.erpspring.BLL.service.astratti;



import it.unikey.erpspring.BLL.dto.request.CollaboratoreRequestDTO;
import it.unikey.erpspring.BLL.dto.response.CollaboratoreResponseDTO;

import java.util.List;

public interface CollaboratoreService {
    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);
    CollaboratoreResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<CollaboratoreResponseDTO> findAllCollaboratori();
}
