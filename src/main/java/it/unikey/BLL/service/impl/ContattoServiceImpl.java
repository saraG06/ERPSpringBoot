package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.ContattoRequestDTO;
import it.unikey.BLL.mapper.dto.response.ContattoResponseDTO;
import it.unikey.BLL.mapper.implementation.ContattoRequestMapper;
import it.unikey.BLL.mapper.implementation.ContattoResponseMapper;
import it.unikey.BLL.service.abstraction.ContattoService;
import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContattoServiceImpl implements ContattoService {

    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;

    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c= contattoRequestMapper.asEntity(contattoRequestDTO);
        contattoRepository.save(c);
    }

    @Override
    public ContattoResponseDTO findById(Long id) {
        Contatto c= contattoRepository.findById(id).get();
        if(c!=null)
            return contattoResponseMapper.asDTO(c);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Contatto c= contattoRepository.findById(id).get();
        if(c!=null)
            contattoRepository.delete(c);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<ContattoResponseDTO> findAllContatto() {
        List<Contatto> contattoList= contattoRepository.findAll();
        return contattoResponseMapper.asDTOList(contattoList);
    }

}
