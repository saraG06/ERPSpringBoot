package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.AziendaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.AziendaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.AziendaService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AziendaServiceImpl implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final OrdineRequestMapper ordineRequestMapper;


    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        List<Dipendente> dipendenteList= dipendenteRequestMapper.asEntityList(aziendaRequestDTO.getDipendenteRequestDTOList());
        List<Collaboratore> collaboratoreList= collaboratoreRequestMapper.asEntityList(aziendaRequestDTO.getCollaboratoreRequestDTOList());
        List<Fattura> fatturaList= fatturaRequestMapper.asEntityList(aziendaRequestDTO.getFatturaRequestDTOList());
        List<Contatto> contattoList= contattoRequestMapper.asEntityList(aziendaRequestDTO.getContattoRequestDTOList());
        List<Ordine> ordineList= ordineRequestMapper.asEntityList(aziendaRequestDTO.getOrdineRequestDTOList());
        a.setListaDipendenti(dipendenteList);
        a.setListaCollaboratori(collaboratoreList);
        a.setListaFatture(fatturaList);
        a.setListaContatti(contattoList);
        a.setListaOrdini(ordineList);

        aziendaRepository.save(a);
    }

    @Override
    public AziendaResponseDTO findByid(Long id) throws IdNotFound {
        Azienda a = aziendaRepository.getById(id);
        if(a != null)
            return aziendaResponseMapper.asDTO(a);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(aziendaRepository.existsById(id)) {
            aziendaRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<AziendaResponseDTO> findAllAzienda() {
        List<Azienda> list = aziendaRepository.findAll();
        return aziendaResponseMapper.asDTOList(list);
    }
}
