package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CollaboratorRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.CollaboratorResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.repository.CollaboratorRepository;
import it.unikey.erpspring.BLL.service.abstraction.CollaboratorService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService {
    private final CollaboratorRepository collaboratorRepository;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final CollaboratorResponseMapper collaboratorResponseMapper;
    private final OrderRequestMapper orderRequestMapper;

    @Override
    public void saveCollaborator(CollaboratorRequestDTO collaboratorRequestDTO) {
        Collaborator c = collaboratorRequestMapper.asEntity(collaboratorRequestDTO);
        List<Order> orderList = orderRequestMapper.asEntityList(collaboratorRequestDTO.getWorkerRequestDTO().getOrderRequestDTOList());
        c.getWorker().setOrders(orderList);
        collaboratorRepository.save(c);
    }

    @Override
    public CollaboratorResponseDTO getCollaboratorById(Long id) throws EntityNotFoundException {
        Collaborator c = null;
        if (collaboratorRepository.findById(id).isPresent()) {
            c = collaboratorRepository.findById(id).get();
        }
        if(c == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return collaboratorResponseMapper.asDTO(c);
        }
    }

    @Override
    public void deleteCollaboratorById(Long id) throws EntityNotFoundException {
        if(collaboratorRepository.findById(id).isPresent()) {
            Collaborator c = collaboratorRepository.findById(id).get();
            if (c != null) {
                collaboratorRepository.delete(c);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<CollaboratorResponseDTO> getAllCollaborator() {
        return collaboratorResponseMapper.asDTOList(collaboratorRepository.findAll());
    }
}

