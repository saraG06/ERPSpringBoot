package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.ContattoRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ContattoResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.ContattoService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.ContattoRepository;
import com.example.ERPSpringBoot.DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ContattoServiceImpl implements ContattoService {
    private final ContattoRepository contattoRepository;
    private final FatturaRepository fatturaRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final ClienteRequestMapper clienteRequestMapper;
    private final FatturaRequestMapper fatturaRequestMapper;
    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c = contattoRequestMapper.asEntity(contattoRequestDTO);
        Azienda azienda= aziendaRequestMapper.asEntity(contattoRequestDTO.getAziendaRequestDTO());
        Cliente cliente= clienteRequestMapper.asEntity(contattoRequestDTO.getClienteRequestDTO());
        List<Fattura> fatturaList= fatturaRequestMapper.asEntityList(contattoRequestDTO.getFatturaRequestDTOList());

        c.setFattura(fatturaList);
        contattoRepository.save(c);
        for(Fattura f: fatturaList){
        fatturaRepository.save(f);
            f.setContatto(c);
        }
        c.setAzienda(azienda);
        c.setCliente(cliente);






    }

    @Override
    public ContattoResponseDTO findByid(Long id) throws IdNotFound {
        Contatto c = contattoRepository.getById(id);
        if(c != null)
            return contattoResponseMapper.asDTO(c);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(contattoRepository.existsById(id)) {
            contattoRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<ContattoResponseDTO> findAllContatto() {
        List<Contatto> list = contattoRepository.findAll();
        return contattoResponseMapper.asDTOList(list);
    }
}
