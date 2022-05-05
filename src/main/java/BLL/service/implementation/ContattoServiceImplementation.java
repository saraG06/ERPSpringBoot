package BLL.service.implementation;

import BLL.dto.Request.ContattoRequestDTO;
import BLL.dto.Response.ContattoResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.ContattoResponseMapper;
import BLL.service.abstraction.ContattoService;
import DAL.Entity.*;
import DAL.Repository.ContattoRepository;
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
