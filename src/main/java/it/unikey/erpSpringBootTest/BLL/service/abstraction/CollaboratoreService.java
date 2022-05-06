package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.CollaboratoreRequestDTO;

public interface CollaboratoreService {

    void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO);

    void deleteCollaboratoreById(Long id);
}
