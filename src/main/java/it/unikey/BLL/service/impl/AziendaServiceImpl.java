package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.AziendaRequestDTO;
import it.unikey.BLL.mapper.dto.response.AziendaResponseDTO;
import it.unikey.BLL.mapper.implementation.AziendaRequestMapper;
import it.unikey.BLL.mapper.implementation.AziendaResponseMapper;
import it.unikey.BLL.service.abstraction.AziendaService;
import it.unikey.DAL.Entity.Azienda;
import it.unikey.DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AziendaServiceImpl implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;

    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a= aziendaRequestMapper.asEntity(aziendaRequestDTO);
        aziendaRepository.save(a);
    }

    @Override
    public AziendaResponseDTO findById(Long id) {
        Azienda a= aziendaRepository.findById(id).get();
        if(a!=null)
            return aziendaResponseMapper.asDTO(a);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Azienda a= aziendaRepository.findById(id).get();
        if(a!=null)
            aziendaRepository.delete(a);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<AziendaResponseDTO> findAllAzienda() {
        List<Azienda> aziendaList= aziendaRepository.findAll();
        return aziendaResponseMapper.asDTOList(aziendaList);
    }

    @Override
    public Integer numeroDipendenti() {
        Integer nDipendenti= aziendaRepository.numeroDipendenti();
        return nDipendenti;
    }

}
