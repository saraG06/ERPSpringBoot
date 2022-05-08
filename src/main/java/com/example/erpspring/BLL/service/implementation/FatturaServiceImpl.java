package com.example.erpspring.BLL.service.implementation;

import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;
import com.example.erpspring.BLL.mapper.implementation.ContattoRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.FatturaRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.FatturaResponseMapper;
import com.example.erpspring.BLL.mapper.implementation.OrdineRequestMapper;
import com.example.erpspring.BLL.service.abstraction.FatturaService;
import com.example.erpspring.DAL.Entity.Fattura;
import com.example.erpspring.DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {

    FatturaRepository fatturaRepository;
    FatturaRequestMapper fatturaRequestMapper;
    FatturaResponseMapper fatturaResponseMapper;
    OrdineRequestMapper ordineRequestMapper;
    ContattoRequestMapper contattoRequestMapper;
    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        f.setOrdine(ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO()));
        f.setContatto(contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO()));
        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findById(Long id) {
        return fatturaResponseMapper.asDTO(fatturaRepository.findById(id).get());
    }

    @Override
    public void deleteFatturaById(Long id) {
        fatturaRepository.deleteById(id);
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {
        return fatturaResponseMapper.asDTOList(fatturaRepository.findAll());
    }

    @Override
    public List<FatturaResponseDTO> findFattureDopo2019() {
        return fatturaResponseMapper.asDTOList(fatturaRepository.dopo2019(LocalDate.parse("2019-12-31")));
    }

    @Override
    public List<FatturaResponseDTO> findFattureReply() {
        List<Fattura> list = fatturaRepository.fattureCliente("Reply");
        return  fatturaResponseMapper.asDTOList(list);
    }
    @Override
    public List<FatturaResponseDTO> findFattureAziendaContatto(ContattoRequestDTO c) {
        List<Fattura> list = fatturaRepository.fattureCliente(c.getClienteRequestDTO().getNome());
        return  fatturaResponseMapper.asDTOList(list);
    }
    @Override
    public void fatturaDaContatto(ContattoRequestDTO c, OrdineRequestDTO o, LocalDate date) {
        FatturaRequestDTO f = new FatturaRequestDTO();
        f.setContattoRequestDTO(c);
        f.setOrdineRequestDTO(o);
        f.setData(date);
        saveFattura(f);
    }

}
