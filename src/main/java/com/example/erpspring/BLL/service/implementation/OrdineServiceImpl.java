package com.example.erpspring.BLL.service.implementation;

import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.dto.response.OrdineResponseDTO;
import com.example.erpspring.BLL.mapper.implementation.OperatoreRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.OrdineRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.OrdineResponseMapper;
import com.example.erpspring.BLL.service.abstraction.OrdineService;
import com.example.erpspring.DAL.Entity.Ordine;
import com.example.erpspring.DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdineServiceImpl implements OrdineService {

    private final OrdineRepository ordineRepository;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    @Override
    public void saveOrdine(OrdineRequestDTO autoRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(autoRequestDTO);
        o.setOperatore(operatoreRequestMapper.asEntity(autoRequestDTO.getOperatoreRequestDTO()));
        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findById(Long id) {
        return ordineResponseMapper.asDTO(ordineRepository.findById(id).get());
    }

    @Override
    public void deleteOrdineById(Long id) {
        ordineRepository.deleteById(id);
    }

    @Override
    public List<OrdineResponseDTO> findAllOrdine() {
        return ordineResponseMapper.asDTOList(ordineRepository.findAll());
    }

    @Override
    public List<OrdineResponseDTO> findOrdiniSenzaFattura() {
        List<Ordine> fatturati = ordineRepository.ordiniFatturati();
        List<Ordine> tutti = ordineRepository.findAll() ;
        List<Ordine> nonFatturati = tutti.stream().filter(o -> !fatturati.contains(o)).collect(Collectors.toList()) ;
        return  ordineResponseMapper.asDTOList(nonFatturati) ;
    }
}
