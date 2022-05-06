package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.DipendenteResponseDTO;

import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.DipendenteService;

import com.example.ERPSpringBoot.DAL.Entity.Azienda;
import com.example.ERPSpringBoot.DAL.Entity.Dipendente;
import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import com.example.ERPSpringBoot.DAL.Entity.Risorsa;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DipendenteServiceImpl implements DipendenteService {
    private final DipendenteRepository dipendenteRepository;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final RisorsaRequestMapper risorsaRequestMapper;
    @Override
    public void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO) {
        Dipendente d = dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        Azienda azienda= aziendaRequestMapper.asEntity(dipendenteRequestDTO.getAziendaRequestDTO());
        Operatore operatore= operatoreRequestMapper.asEntity(dipendenteRequestDTO.getOperatoreRequestDTO());
        Risorsa risorsa= risorsaRequestMapper.asEntity(dipendenteRequestDTO.getRisorsaRequestDTO());
        d.setAzienda(azienda);
        d.setO(operatore);
        d.setRisorsa(risorsa);

        dipendenteRepository.save(d);
    }

    @Override
    public DipendenteResponseDTO findByid(Long id) throws IdNotFound {
        Dipendente d = dipendenteRepository.getById(id);
        if(d != null)
            return dipendenteResponseMapper.asDTO(d);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(dipendenteRepository.existsById(id)) {
            dipendenteRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<DipendenteResponseDTO> findAllDipendente() {
        List<Dipendente> list = dipendenteRepository.findAll();
        return dipendenteResponseMapper.asDTOList(list);
    }

    @Override
    public List<DipendenteResponseDTO> dipendeteMacchina() {
        List<Dipendente> list = dipendenteRepository.dipendeteMacchina();
        return dipendenteResponseMapper.asDTOList(list);
    }
}
