package BLL.service.implementation;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.mapper.implementation.DipendenteRequestMapper;
import BLL.mapper.implementation.DipendenteResponseMapper;
import BLL.mapper.implementation.OperatoreRequestMapper;
import BLL.service.abstraction.DipendenteService;
import DAL.Entity.persone.Dipendente;
import DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DipendenteServiceImpl implements DipendenteService {

    DipendenteRepository dipendenteRepository;
    DipendenteRequestMapper dipendenteRequestMapper;
    DipendenteResponseMapper dipendenteResponseMapper;
    OperatoreRequestMapper operatoreRequestMapper;

    @Override
    public void saveDipendete(DipendenteRequestDTO dipendenteRequestDTO) {

        Dipendente d = dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        d.setOperatore(operatoreRequestMapper.asEntity(dipendenteRequestDTO.getOperatoreRequestDTO()));
        dipendenteRepository.save(d);

    }

    @Override
    public DipendenteResponseDTO findById(Long id) {
        return dipendenteResponseMapper.asDTO(dipendenteRepository.getById(id));
    }

    @Override
    public void deleteDipendenteById(Long id) {
        dipendenteRepository.deleteById(id);
    }

    @Override
    public List<DipendenteResponseDTO> findAllDipendente() {
        return dipendenteResponseMapper.asDTOList(dipendenteRepository.findAll());
    }
}
