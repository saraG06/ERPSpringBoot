package BLL.service.implementation;

import BLL.dto.Request.CollaboratoreRequestDTO;
import BLL.dto.Response.CollaboratoreResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.CollaboratoreResponseMapper;
import BLL.service.abstraction.CollaboratoreService;
import DAL.Entity.*;
import DAL.Repository.CollaboratoreRepository;
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
    public List<CollaboratoreResponseDTO> findAllPersona() {

        List<Collaboratore> lista = collaboratoreRepository.findAll();

        return collaboratoreResponseMapper.asDTOList(lista);
    }
}
