package BLL.service.implementation;

import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.mapper.implementation.CollaboratoreRequestMapper;
import BLL.mapper.implementation.CollaboratoreResponseMapper;
import BLL.mapper.implementation.OperatoreRequestMapper;
import BLL.service.abstraction.CollaboratoreService;
import DAL.Entity.persone.Collaboratore;
import DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImpl implements CollaboratoreService {

    CollaboratoreRequestMapper collaboratoreRequestMapper;
    CollaboratoreResponseMapper collaboratoreResponseMapper;
    CollaboratoreRepository collaboratoreRepository;
    OperatoreRequestMapper operatoreRequestMapper;


    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        c.setOperatore(operatoreRequestMapper.asEntity(collaboratoreRequestDTO.getOperatoreRequestDTO()));
        collaboratoreRepository.save(c);
    }

    @Override
    public CollaboratoreResponseDTO findById(Long id) {

        return collaboratoreResponseMapper.asDTO(collaboratoreRepository.findById(id).get());
    }

    @Override
    public void deleteCollaboratoreById(Long id) {
        collaboratoreRepository.deleteById(id);
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratore() {
        return collaboratoreResponseMapper.asDTOList(collaboratoreRepository.findAll());
    }
}
