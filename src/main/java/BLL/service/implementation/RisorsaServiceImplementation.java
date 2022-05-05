package BLL.service.implementation;

import BLL.dto.Request.RisorsaRequestDTO;
import BLL.dto.Response.RisorsaResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.RisorsaResponseMapper;
import BLL.service.abstraction.RisorsaService;
import DAL.Entity.*;
import DAL.Repository.RisorsaRepository;
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
