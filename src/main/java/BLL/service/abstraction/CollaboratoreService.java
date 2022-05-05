package BLL.service.abstraction;

import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.dto.response.ContattoResponseDTO;

import java.util.List;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);
    CollaboratoreResponseDTO findById(Long id) ;
    void deleteCollaboratoreById(Long id) ;
    List<CollaboratoreResponseDTO> findAllCollaboratore();
}
