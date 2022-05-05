package BLL.service.implementation;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.response.ContattoResponseDTO;
import BLL.mapper.implementation.ClienteRequestMapper;
import BLL.mapper.implementation.ContattoRequestMapper;
import BLL.mapper.implementation.ContattoResponseMapper;
import BLL.mapper.implementation.FatturaRequestMapper;
import BLL.service.abstraction.ContattoService;
import DAL.Entity.persone.Contatto;
import DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ContattoServiceImpl implements ContattoService {
    ContattoRepository contattoRepository;
    ContattoRequestMapper contattoRequestMapper;
    ContattoResponseMapper contattoResponseMapper;
    ClienteRequestMapper clienteRequestMapper;
    FatturaRequestMapper fatturaRequestMapper;

    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {
        Contatto c = contattoRequestMapper.asEntity(contattoRequestDTO);
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
