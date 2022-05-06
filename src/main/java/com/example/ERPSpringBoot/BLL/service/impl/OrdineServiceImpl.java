package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.OrdineRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OrdineResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.OrdineService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrdineServiceImpl implements OrdineService {
    private final OrdineRepository ordineRepository;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final ClienteRequestMapper clienteRequestMapper;
    @Override
    public void saveOrdine(OrdineRequestDTO ordineRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(ordineRequestDTO);
        Azienda azienda= aziendaRequestMapper.asEntity(ordineRequestDTO.getAziendaRequestDTO());
        Cliente cliente= clienteRequestMapper.asEntity(ordineRequestDTO.getClienteRequestDTO());
        Operatore operatore= operatoreRequestMapper.asEntity(ordineRequestDTO.getOperatoreRequestDTO());
        Fattura fattura= fatturaRequestMapper.asEntity(ordineRequestDTO.getFatturaRequestDTO());
        o.setAzienda(azienda);
        o.setOperatore(operatore);
        o.setCliente(cliente);
        o.setFattura(fattura);

        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findByid(Long id) throws IdNotFound {
        Ordine o = ordineRepository.getById(id);
        if(o != null)
            return ordineResponseMapper.asDTO(o);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(ordineRepository.existsById(id)) {
            ordineRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<OrdineResponseDTO> findAllOrdine() {
        List<Ordine> list = ordineRepository.findAll();
        return ordineResponseMapper.asDTOList(list);
    }

    @Override
    public List<OrdineResponseDTO> noFattura() {
        List<Ordine> list = ordineRepository.noFattura();
        return ordineResponseMapper.asDTOList(list);
    }
}
