package it.unikey.BLL.service.impl;

import it.unikey.BLL.Exception.LowRoleException;
import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.BLL.mapper.dto.request.RisorsaRequestDTO;
import it.unikey.BLL.mapper.dto.response.RisorsaResponseDTO;
import it.unikey.BLL.mapper.implementation.RisorsaRequestMapper;
import it.unikey.BLL.mapper.implementation.RisorsaResponseMapper;
import it.unikey.BLL.service.abstraction.RisorsaService;
import it.unikey.DAL.Entity.Risorsa;
import it.unikey.DAL.Repository.RisorsaRepository;
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
    public void assegnaRisorsa(DipendenteRequestDTO capo, DipendenteRequestDTO dip, RisorsaRequestDTO risorsaRequestDTO) throws LowRoleException {
        if((capo.getRuoloRequestDTO().equals("PROJECTMANAGER") && dip.getRuoloRequestDTO().equals("OPERATOR")) || capo.getRuoloRequestDTO().equals("MANAGER")){
            Risorsa r= risorsaRequestMapper.asEntity(risorsaRequestDTO);
            risorsaRepository.save(r);
        } else {
            throw new LowRoleException();
        }
    }
}
