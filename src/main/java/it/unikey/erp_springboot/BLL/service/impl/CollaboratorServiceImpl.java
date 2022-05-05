package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.CollaboratorRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.CollaboratorResponseMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.OperatorRequestMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.CollaboratorService;
import it.unikey.erp_springboot.DAL.Entity.Collaborator;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Operator;
import it.unikey.erp_springboot.DAL.Repository.CollaboratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService {

    private CollaboratorRepository collaboratorRepository;
    private CollaboratorRequestMapper collaboratorRequestMapper;
    private CollaboratorResponseMapper collaboratorResponseMapper;
    private OperatorRequestMapper operatorRequestMapper;
    @Override
    public void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDTO);
        Operator o = operatorRequestMapper.asEntity(collaboratorRequestDTO.getOperatorRequestDTO());
        c.setOperator(o);
        Company co = o.getCompany();
        o.setCompany(co);
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDTO findById(Long id) {
        Collaborator c = collaboratorRepository.getById(id);
        if(c != null){
            return collaboratorResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }
    @Override
    public void deleteCollaboratorById(Long id) {
        if(collaboratorRepository.existsById(id)){
            collaboratorRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<CollaboratorResponseDTO> findAllCollaborator() {
        List<Collaborator> list = collaboratorRepository.findAll();
        return collaboratorResponseMapper.asDTOList(list);
    }
}
