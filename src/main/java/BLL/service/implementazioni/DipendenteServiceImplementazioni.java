package BLL.service.implementazioni;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.mapper.implementazioni.request.DipendenteRequestMapper;
import BLL.mapper.implementazioni.response.DipendenteResponseMapper;
import BLL.service.astratti.DipendenteService;
import DAL.Entity.Dipendente;
import DAL.Repository.DipendenteRepository;
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
}
