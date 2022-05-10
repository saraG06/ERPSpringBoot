package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.CollaboratorRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.request.WorkerRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.CollaboratorResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.CollaboratorService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.repository.CollaboratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService {

    private final CollaboratorResponseDTO collaboratorResponseDTO;
    private final CollaboratorRequestDTO collaboratorRequestDTO;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final CollaboratorResponseMapper collaboratorResponseMapper;
    private final CollaboratorRepository collaboratorRepository;
    private final WorkerRequestMapper workerRequestMapper;


    @Override
    public void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDTO);
       c.setWorker(workerRequestMapper.asEntity(collaboratorRequestDTO.getWorkerRequestDTO()));
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDTO findById(Long id) {
        Collaborator c = collaboratorRepository.getById(id);

        if (id != null){
            return collaboratorResponseMapper.asDTO(c);
        }
        else throw new NullPointerException();
    }

}
