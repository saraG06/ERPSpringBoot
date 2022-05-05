package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.ContattoRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ContattoResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.ClienteRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.ContattoResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.ContattoService;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
import it.unikey.erpspringboot.DAL.Entity.Contatto;
import it.unikey.erpspringboot.DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContattoServiceImplementation implements ContattoService {

    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;

    private final ClienteRequestMapper clienteRequestMapper;


    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c = contattoRequestMapper.asEntity(contattoRequestDTO);
        Cliente cliente = clienteRequestMapper.asEntity(contattoRequestDTO.getClienteRequestDTO());
        c.setCliente(cliente);
        contattoRepository.save(c);
    }

    @Override
    public ContattoResponseDTO findById(Long id) throws NullPointerException{
        Contatto c = contattoRepository.getById(id);
        if(c != null)
            return contattoResponseMapper.asDTO(c);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteContattoById(Long id) throws NullPointerException{
        Contatto c = contattoRepository.getById(id);
        if(c !=null)
            contattoRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<ContattoResponseDTO> findAllContatto() {

        List<Contatto> lista = contattoRepository.findAll();

        return contattoResponseMapper.asDTOList(lista);
    }
}
