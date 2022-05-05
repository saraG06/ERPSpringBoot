package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.CollaboratorRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.BLL.mapper.implementation.response.CollaboratorResponseMapper;
import it.unikey.BLL.service.abstraction.CollaboratorService;
import it.unikey.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.DAL.Entity.Collaborator;
import it.unikey.DAL.Entity.Order;
import it.unikey.DAL.Repository.CollaboratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImplementation implements CollaboratorService {
    private final CollaboratorRepository collaboratorRepository;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final CollaboratorResponseMapper collaboratorResponseMapper;
    private final OrderRequestMapper orderRequestMapper;

    @Override
    public void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDTO);
        List<Order> orderList = orderRequestMapper.asEntityList(collaboratorRequestDTO.getOrderRequestDTOList());
        c.setOrders(orderList);
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDTO findById(Long id) throws IdNotFoundException {
        Collaborator c = null;
        if (collaboratorRepository.findById(id).isPresent()) {
            c = collaboratorRepository.findById(id).get();
        }
        if(c == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return collaboratorResponseMapper.asDto(c);
        }
    }

    @Override
    public void deleteCollaboratorById(Long id) throws IdNotFoundException {
        if(collaboratorRepository.findById(id).isPresent()) {
            Collaborator c = collaboratorRepository.findById(id).get();
            if (c != null) {
                collaboratorRepository.delete(c);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<CollaboratorResponseDTO> findAllCollaborators() {
        return collaboratorResponseMapper.asDTOList(collaboratorRepository.findAll());
    }
}
