package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CollaboratorRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.CollaboratorResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerRequestMapper;
import it.unikey.erpspring.BLL.service.abstraction.CollaboratorService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.repository.CollaboratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService {

    private final CollaboratorRepository collaboratorRepository;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final CollaboratorResponseMapper collaboratorResponseMapper;
    private final WorkerRequestMapper workerRequestMapper;

    @Override
    public void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDTO);
        c.setWorker(workerRequestMapper.asEntity(collaboratorRequestDTO.getWorkerRequestDTO()));
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDTO findCollaboratorById(Long id) throws NullPointerException{
        Collaborator c = collaboratorRepository.getById(id);
        if(id != null){
            return collaboratorResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteCollaboratorById(Long id) throws NullPointerException{
        if(collaboratorRepository.existsById(id)){
            collaboratorRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<CollaboratorResponseDTO> findAllCollaborator() {
        List<Collaborator> c = collaboratorRepository.findAll();
        return collaboratorResponseMapper.asDTOList(c);
    }
}
