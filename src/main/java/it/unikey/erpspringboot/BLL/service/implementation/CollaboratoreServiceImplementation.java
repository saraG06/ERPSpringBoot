package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.CollaboratoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.CollaboratoreResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.CollaboratoreRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.RisorsaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.CollaboratoreResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.CollaboratoreService;
import it.unikey.erpspringboot.DAL.Entity.Collaboratore;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import it.unikey.erpspringboot.DAL.Entity.Risorsa;
import it.unikey.erpspringboot.DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImplementation implements CollaboratoreService {

    private final CollaboratoreRepository collaboratoreRepository;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;

    private final RisorsaRequestMapper risorsaRequestMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;


    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        Operatore o = operatoreRequestMapper.asEntity(collaboratoreRequestDTO.getOperatoreRequestDTO());
        Risorsa r = risorsaRequestMapper.asEntity(collaboratoreRequestDTO.getRisorsaRequestDTO());
        c.setOperatore(o);
        c.setRisorsa(r);
        collaboratoreRepository.save(c);

    }

    @Override
    public CollaboratoreResponseDTO findById(Long id) throws NullPointerException{

        Collaboratore c = collaboratoreRepository.getById(id);
        if(c != null)
            return collaboratoreResponseMapper.asDTO(c);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteCollaboratoreById(Long id) throws NullPointerException{
        Collaboratore c = collaboratoreRepository.getById(id);
        if(c !=null)
            collaboratoreRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratore() {

        List<Collaboratore> lista = collaboratoreRepository.findAll();

        return collaboratoreResponseMapper.asDTOList(lista);
    }
}
