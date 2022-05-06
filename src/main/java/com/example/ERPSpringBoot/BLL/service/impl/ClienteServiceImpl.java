package com.example.ERPSpringBoot.BLL.service.impl;

import com.example.ERPSpringBoot.BLL.dto.request.ClienteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ClienteResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.implementation.*;
import com.example.ERPSpringBoot.BLL.service.abstraction.ClienteService;
import com.example.ERPSpringBoot.DAL.Entity.*;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import com.example.ERPSpringBoot.DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        List<Contatto> contattoList= contattoRequestMapper.asEntityList(clienteRequestDTO.getContattoRequestDTOList());
        List<Ordine> ordineList= ordineRequestMapper.asEntityList(clienteRequestDTO.getOrdineRequestDTOList());
        c.setContatto(contattoList);
        c.setOrdine(ordineList);

        clienteRepository.save(c);
    }

    @Override
    public ClienteResponseDTO findByid(Long id) throws IdNotFound {
        Cliente c = clienteRepository.getById(id);
        if(c != null)
            return clienteResponseMapper.asDTO(c);
        else
            throw new IdNotFound("non presente");
    }

    @Override
    public void deleteByid(Long id) throws IdNotFound {
        if(clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        }else {
            throw new IdNotFound("non presente");
        }
    }

    @Override
    public List<ClienteResponseDTO> findAllCliente() {
        List<Cliente> list = clienteRepository.findAll();
        return clienteResponseMapper.asDTOList(list);
    }

    @Override
    public List<ClienteResponseDTO> contattoMaggiore10() {
        List<Cliente> list = clienteRepository.contattoMaggiore10();
        return clienteResponseMapper.asDTOList(list);
    }
}
