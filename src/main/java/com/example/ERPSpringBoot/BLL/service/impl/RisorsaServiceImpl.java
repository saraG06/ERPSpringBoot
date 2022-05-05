package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.RisorsaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.RisorsaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.RisorsaService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.OrdineRepository;
import com.example.ERPSpringBoot.DAL.Repository.RisorsaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RisorsaServiceImpl implements RisorsaService {
    private final RisorsaRepository risorsaRepository;
    private final RisorsaRequestMapper risorsaRequestMapper;
    private final RisorsaResponseMapper risorsaResponseMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    @Override
    public void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r = risorsaRequestMapper.asEntity(risorsaRequestDTO);
        Operatore operatore= operatoreRequestMapper.asEntity(risorsaRequestDTO.getOperatoreRequestDTO());
        r.setOperatore(operatore);

        risorsaRepository.save(r);
    }

    @Override
    public RisorsaResponseDTO findByid(Long id) throws IdNotFound {
        Risorsa r = risorsaRepository.getById(id);
        if(r != null)
            return risorsaResponseMapper.asDTO(r);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(risorsaRepository.existsById(id)) {
            risorsaRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<RisorsaResponseDTO> findAllRisorsa() {
        List<Risorsa> list = risorsaRepository.findAll();
        return risorsaResponseMapper.asDTOList(list);
    }
}
