package BLL.service.implementazioni;

import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.mapper.implementazioni.request.CollaboratoreRequestMapper;
import BLL.mapper.implementazioni.response.CollaboratoreResponseMapper;
import BLL.service.astratti.CollaboratoreService;
import BLL.Entity.Collaboratore;
import DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImplementazioni implements CollaboratoreService {

    private final CollaboratoreRepository collaboratoreRepository;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;

    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        collaboratoreRepository.save(c);
    }

    @Override
    public CollaboratoreResponseDTO findbyId(Long id) {
        Collaboratore c = collaboratoreRepository.findById(id).get();
        return collaboratoreResponseMapper.asDTO(c);
    }

    @Override
    public void deleteById(Long id) {
        Collaboratore c = collaboratoreRepository.findById(id).get();
        collaboratoreRepository.delete(c);
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratori() {
        List<Collaboratore> collaboratores = collaboratoreRepository.findAll();
        return collaboratoreResponseMapper.asDTOList(collaboratores);
    }
}
