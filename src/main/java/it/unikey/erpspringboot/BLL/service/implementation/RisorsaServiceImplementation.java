package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.RisorsaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RisorsaResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.RisorsaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.RisorsaResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.RisorsaService;
import it.unikey.erpspringboot.DAL.Entity.Risorsa;
import it.unikey.erpspringboot.DAL.Repository.RisorsaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RisorsaServiceImplementation implements RisorsaService {

    private final RisorsaRepository risorsaRepository;
    private final RisorsaRequestMapper risorsaRequestMapper;
    private final RisorsaResponseMapper risorsaResponseMapper;

    @Override
    public void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r = risorsaRequestMapper.asEntity(risorsaRequestDTO);
        risorsaRepository.save(r);
    }

    @Override
    public RisorsaResponseDTO findById(Long id) throws NullPointerException{

        Risorsa r = risorsaRepository.getById(id);
        if(r != null)
            return risorsaResponseMapper.asDTO(r);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteRisorsaById(Long id) throws NullPointerException{
        Risorsa r = risorsaRepository.getById(id);
        if(r !=null)
            risorsaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<RisorsaResponseDTO> findAllRisorsa() {
        List<Risorsa> lista = risorsaRepository.findAll();

        return risorsaResponseMapper.asDTOList(lista);
    }
}
