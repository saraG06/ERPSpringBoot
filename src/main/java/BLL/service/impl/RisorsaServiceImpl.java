package BLL.service.impl;

import BLL.mapper.dto.request.DipendenteRequestDTO;
import BLL.mapper.dto.request.RisorsaRequestDTO;
import BLL.mapper.dto.response.RisorsaResponseDTO;
import BLL.mapper.implementation.RisorsaRequestMapper;
import BLL.mapper.implementation.RisorsaResponseMapper;
import BLL.service.abstraction.RisorsaService;
import DAL.Entity.Risorsa;
import DAL.Repository.RisorsaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RisorsaServiceImpl implements RisorsaService {

    private final RisorsaRepository risorsaRepository;
    private final RisorsaRequestMapper risorsaRequestMapper;
    private final RisorsaResponseMapper risorsaResponseMapper;

    @Override
    public void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r= risorsaRequestMapper.asEntity(risorsaRequestDTO);
        risorsaRepository.save(r);
    }

    @Override
    public RisorsaResponseDTO findById(Long id) {
        Risorsa r= risorsaRepository.findById(id).get();
        if(r!=null)
            return risorsaResponseMapper.asDTO(r);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Risorsa r= risorsaRepository.findById(id).get();
        if(r!=null)
            risorsaRepository.delete(r);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<RisorsaResponseDTO> findAllRisorsa() {
        List<Risorsa> risorsaList= risorsaRepository.findAll();
        return risorsaResponseMapper.asDTOList(risorsaList);
    }

    @Override
    public void assegnaRisorsa(DipendenteRequestDTO capo, DipendenteRequestDTO dip, RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r= risorsaRequestMapper.asEntity(risorsaRequestDTO);
        risorsaRepository.save(r);
    }
}
