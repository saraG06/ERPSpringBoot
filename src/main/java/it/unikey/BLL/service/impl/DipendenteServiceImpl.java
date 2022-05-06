package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.BLL.mapper.dto.response.DipendenteResponseDTO;
import it.unikey.BLL.mapper.implementation.DipendenteRequestMapper;
import it.unikey.BLL.mapper.implementation.DipendenteResponseMapper;
import it.unikey.BLL.service.abstraction.DipendenteService;
import it.unikey.DAL.Entity.Dipendente;
import it.unikey.DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DipendenteServiceImpl implements DipendenteService {

    private final DipendenteRepository dipendenteRepository;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;


    @Override
    public void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO) {
        Dipendente d= dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        dipendenteRepository.save(d);
    }

    @Override
    public DipendenteResponseDTO findById(Long id) {
        Dipendente d= dipendenteRepository.findById(id).get();
        if(d!=null)
            return dipendenteResponseMapper.asDTO(d);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Dipendente d= dipendenteRepository.findById(id).get();
        if(d!=null)
            dipendenteRepository.delete(d);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<DipendenteResponseDTO> findAllDipendente() {
        List<Dipendente> dipendenteList= dipendenteRepository.findAll();
        return dipendenteResponseMapper.asDTOList(dipendenteList);
    }

    @Override
    public List<DipendenteResponseDTO> ultimiDipendentiAssunti(LocalDate now) {
        now= LocalDate.now();
        List<Dipendente> dipendenteList= dipendenteRepository.ultimiDipendentiAssunti(now);
        return dipendenteResponseMapper.asDTOList(dipendenteList);
    }

    @Override
    public List<DipendenteResponseDTO> dipendentiConMacchina() {
        List<Dipendente> dipendenteList= dipendenteRepository.dipendentiConMacchina();
        return dipendenteResponseMapper.asDTOList(dipendenteList);
    }

}
