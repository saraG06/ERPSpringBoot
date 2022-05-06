package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.CollaboratoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.CollaboratoreRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.CollaboratoreResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OperatoreResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.CollaboratoreService;
import it.unikey.erpSpringBootTest.DAL.Entity.Collaboratore;
import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import it.unikey.erpSpringBootTest.DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImpl implements CollaboratoreService {

    private final CollaboratoreRepository collaboratoreRepository;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;

    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        Operatore o = operatoreRequestMapper.asEntity(collaboratoreRequestDTO.getOperatoreRequestDTO());
        c.setOperatore(o);
        collaboratoreRepository.save(c);
    }

    @Override
    public void deleteCollaboratoreById(Long id) {

    }
}
