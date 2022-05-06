package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.CollaboratoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.CollaboratoreResponseDTO;
import it.unikey.BLL.mapper.implementation.CollaboratoreRequestMapper;
import it.unikey.BLL.mapper.implementation.CollaboratoreResponseMapper;
import it.unikey.BLL.service.abstraction.CollaboratoreService;
import it.unikey.DAL.Entity.Collaboratore;
import it.unikey.DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImpl implements CollaboratoreService {

    private final CollaboratoreRepository collaboratoreRepository;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;

    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c= collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        collaboratoreRepository.save(c);
    }

    @Override
    public CollaboratoreResponseDTO findById(Long id) {
        Collaboratore c= collaboratoreRepository.findById(id).get();
        if(c!=null)
            return collaboratoreResponseMapper.asDTO(c);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Collaboratore c= collaboratoreRepository.findById(id).get();
        if(c!=null)
            collaboratoreRepository.delete(c);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratore() {
        List<Collaboratore> collaboratoreList= collaboratoreRepository.findAll();
        return collaboratoreResponseMapper.asDTOList(collaboratoreList);
    }
}
