package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.FatturaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.FatturaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.FatturaService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {
    private final FatturaRepository fatturaRepository;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        Azienda azienda= aziendaRequestMapper.asEntity(fatturaRequestDTO.getAziendaRequestDTO());
        Contatto contatto= contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO());
        Ordine ordine= ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO());
        f.setAzienda(azienda);
        f.setContatto(contatto);
        f.setOrdine(ordine);

        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findByid(Long id) throws IdNotFound {
        Fattura f = fatturaRepository.getById(id);
        if(f != null)
            return fatturaResponseMapper.asDTO(f);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(fatturaRepository.existsById(id)) {
           fatturaRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {
        List<Fattura> list = fatturaRepository.findAll();
        return fatturaResponseMapper.asDTOList(list);
    }

    @Override
    public List<FatturaResponseDTO> fatturaAfterDate() {
        List<Fattura> list = fatturaRepository.fatturaAfterDate();
        return fatturaResponseMapper.asDTOList(list);
    }

    @Override
    public List<FatturaResponseDTO> fatturaReply(String azienda) {
        List<Fattura> list = fatturaRepository.fatturaReply("Reply");
        return fatturaResponseMapper.asDTOList(list);
    }
}
