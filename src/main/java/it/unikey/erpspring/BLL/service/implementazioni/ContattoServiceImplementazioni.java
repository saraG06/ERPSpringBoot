package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpspring.BLL.dto.response.ContattoResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.ContattoRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.ContattoResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.ContattoService;
import it.unikey.erpspring.DAL.Entity.Contatto;
import it.unikey.erpspring.DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContattoServiceImplementazioni implements ContattoService{

    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;


    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto a = contattoRequestMapper.asEntity(contattoRequestDTO);
        contattoRepository.save(a);
    }

    @Override
    public ContattoResponseDTO findbyId(Long id) {
        Contatto c = contattoRepository.getById(id);
        if(c != null)
            return contattoResponseMapper.asDTO(c);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteById(Long id) {
        Contatto c = contattoRepository.getById(id);
        if(c !=null)
            contattoRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<ContattoResponseDTO> findAllContatti() {
        List<Contatto> lista = contattoRepository.findAll();
        return contattoResponseMapper.asDTOList(lista);
    }
}
