package com.example.erpspring.BLL.service.implementation;

import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.response.ContattoResponseDTO;
import com.example.erpspring.BLL.mapper.implementation.ClienteRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.ContattoRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.ContattoResponseMapper;
import com.example.erpspring.BLL.mapper.implementation.FatturaRequestMapper;
import com.example.erpspring.BLL.service.abstraction.ContattoService;
import com.example.erpspring.DAL.Entity.persone.Contatto;
import com.example.erpspring.DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ContattoServiceImpl implements ContattoService {
    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;
    private final ClienteRequestMapper clienteRequestMapper;
    private final FatturaRequestMapper fatturaRequestMapper;

    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c = contattoRequestMapper.asEntity(contattoRequestDTO);
        if(contattoRequestDTO.getClienteRequestDTO() != null )
            c.setCliente(clienteRequestMapper.asEntity(contattoRequestDTO.getClienteRequestDTO()));
        c.setFatture(fatturaRequestMapper.asEntityList(contattoRequestDTO.getFatturaRequestDTOList()));
        contattoRepository.save(c);
    }

    @Override
    public ContattoResponseDTO findById(Long id) {
        return contattoResponseMapper.asDTO(contattoRepository.findById(id).get());
    }

    @Override
    public void deleteContattoById(Long id) {
        contattoRepository.deleteById(id);
    }

    @Override
    public List<ContattoResponseDTO> findAllContatto() {
        return contattoResponseMapper.asDTOList(contattoRepository.findAll());
    }


}
