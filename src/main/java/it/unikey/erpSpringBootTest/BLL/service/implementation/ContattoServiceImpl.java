package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ContattoResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.ContattoService;
import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import it.unikey.erpSpringBootTest.DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContattoServiceImpl implements ContattoService {

    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;

    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c = contattoRequestMapper.asEntity(contattoRequestDTO);
        contattoRepository.save(c);
    }

    @Override
    public void deleteContattoById(Long id) {

    }
}
