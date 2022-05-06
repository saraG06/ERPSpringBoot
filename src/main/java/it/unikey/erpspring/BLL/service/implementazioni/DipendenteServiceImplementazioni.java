package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.DipendenteRequestDTO;
import it.unikey.erpspring.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.DipendenteRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.DipendenteResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.DipendenteService;
import it.unikey.erpspring.DAL.Entity.Dipendente;
import it.unikey.erpspring.DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DipendenteServiceImplementazioni implements DipendenteService {

    private final DipendenteRepository dipendenteRepository;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;

    @Override
    public void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO) {
        Dipendente d = dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        dipendenteRepository.save(d);
    }

    @Override
    public DipendenteResponseDTO findbyId(Long id) {
        Dipendente d = dipendenteRepository.findById(id).get();
        return dipendenteResponseMapper.asDTO(d);
    }

    @Override
    public void deleteById(Long id) {
        Dipendente d = dipendenteRepository.findById(id).get();
        dipendenteRepository.delete(d);
    }

    @Override
    public List<DipendenteResponseDTO> findAllDipendenti() {
        List<Dipendente> dipendentes = dipendenteRepository.findAll();
        return dipendenteResponseMapper.asDTOList(dipendentes);
    }

    @Override
    public List<DipendenteResponseDTO> dipendentiConRisorse() {
        return dipendentiConRisorse();
    }
}
