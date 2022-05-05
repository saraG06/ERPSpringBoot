package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.OperatoreService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OperatoreServiceImpl implements OperatoreService {
    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    private final RisorsaRequestMapper risorsaRequestMapper;
    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper.asEntity(operatoreRequestDTO);
        List<Ordine> ordine= ordineRequestMapper.asEntityList(operatoreRequestDTO.getOrdineRequestDTOList());
        List<Risorsa> risorsa= risorsaRequestMapper.asEntityList(operatoreRequestDTO.getRisorsaRequestDTOList());
        o.setOrdine(ordine);
        o.setRisorseAssegnate(risorsa);

        operatoreRepository.save(o);
    }

    @Override
    public OperatoreResponseDTO findByid(Long id) throws IdNotFound {
        Operatore o = operatoreRepository.getById(id);
        if(o != null)
            return operatoreResponseMapper.asDTO(o);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(operatoreRepository.existsById(id)) {
            operatoreRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<OperatoreResponseDTO> findAllOperatore() {
        List<Operatore> list = operatoreRepository.findAll();
        return operatoreResponseMapper.asDTOList(list);
    }
}
