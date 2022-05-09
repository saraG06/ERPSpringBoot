package com.example.erpspring.BLL.service.implementation;

import com.example.erpspring.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.erpspring.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.erpspring.BLL.mapper.implementation.CollaboratoreRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.CollaboratoreResponseMapper;
import com.example.erpspring.BLL.mapper.implementation.OperatoreRequestMapper;
import com.example.erpspring.BLL.service.abstraction.CollaboratoreService;
import com.example.erpspring.DAL.Entity.persone.Collaboratore;
import com.example.erpspring.DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImpl implements CollaboratoreService {

    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;
    private final CollaboratoreRepository collaboratoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;


    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        c.setOperatore(operatoreRequestMapper.asEntity(collaboratoreRequestDTO.getOperatoreRequestDTO()));
        collaboratoreRepository.save(c);
    }

    @Override
    public CollaboratoreResponseDTO findById(Long id) {

        return collaboratoreResponseMapper.asDTO(collaboratoreRepository.findById(id).get());
    }

    @Override
    public void deleteCollaboratoreById(Long id) {
        collaboratoreRepository.deleteById(id);
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratore() {
        return collaboratoreResponseMapper.asDTOList(collaboratoreRepository.findAll());
    }
}
