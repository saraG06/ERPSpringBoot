package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.CollaboratorRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.CollaboratorResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.CollaboratorRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.CollaboratorResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.CollaboratorService;
import it.unikey.ERPSpringBoot.DAL.Entity.Collaborator;
import it.unikey.ERPSpringBoot.DAL.Repository.CollaboratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService {

    private final CollaboratorRepository collaboratorRepository;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final CollaboratorResponseMapper collaboratorResponseMapper;

    @Override
    public void saveCollaborator(CollaboratorRequestDto collaboratorRequestDto) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDto);
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDto findById(Long id) throws NullPointerException{
        Collaborator c =  collaboratorRepository.getById(id);
        if (c != null) {
            collaboratorRepository.findById(id);
        } else throw new NullPointerException();


        return collaboratorResponseMapper.asDto(c);
    }
    }

