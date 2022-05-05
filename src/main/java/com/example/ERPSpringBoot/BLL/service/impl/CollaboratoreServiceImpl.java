package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.CollaboratoreService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.CollaboratoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CollaboratoreServiceImpl implements CollaboratoreService {
    private final CollaboratoreRepository collaboratoreRepository;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final RisorsaRequestMapper risorsaRequestMapper;

    @Override
    public void saveCollaboratore(CollaboratoreRequestDTO collaboratoreRequestDTO) {
        Collaboratore c = collaboratoreRequestMapper.asEntity(collaboratoreRequestDTO);
        Azienda azienda= aziendaRequestMapper.asEntity(collaboratoreRequestDTO.getAziendaRequestDTO());
        Operatore operatore= operatoreRequestMapper.asEntity(collaboratoreRequestDTO.getOperatoreRequestDTO());
        Risorsa risorsa= risorsaRequestMapper.asEntity(collaboratoreRequestDTO.getRisorsaRequestDTO());
        c.setAzienda(azienda);
        c.setO(operatore);
        c.setRisorsa(risorsa);

        collaboratoreRepository.save(c);
    }

    @Override
    public CollaboratoreResponseDTO findByid(Long id) throws IdNotFound {
        Collaboratore c = collaboratoreRepository.getById(id);
        if(c != null)
            return collaboratoreResponseMapper.asDTO(c);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(collaboratoreRepository.existsById(id)) {
            collaboratoreRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<CollaboratoreResponseDTO> findAllCollaboratore() {
        List<Collaboratore> list = collaboratoreRepository.findAll();
        return collaboratoreResponseMapper.asDTOList(list);
    }
}
