package BLL.service.implementation;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.mapper.implementation.DipendenteRequestMapper;
import BLL.mapper.implementation.DipendenteResponseMapper;
import BLL.mapper.implementation.OperatoreRequestMapper;
import BLL.service.abstraction.DipendenteService;
import DAL.Entity.Enum.Risorse;
import DAL.Entity.persone.Dipendente;
import DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public Integer numeroDipendentiAzienda(){
        return findAllDipendente().size() ;
    }


    public List<DipendenteResponseDTO> dipendentiMenoDiUnMese(){

        List<Dipendente> list = dipendenteRepository.dipendentiMenoDiUnMese(LocalDate.now().minusDays(31));
        return  dipendenteResponseMapper.asDTOList(list) ;
    }

    public List<DipendenteResponseDTO> findDipendentiAuto(Risorse auto){
        List<Dipendente> list = dipendenteRepository.dipendentiConRisorsa(Risorse.MACCHINA);
        return dipendenteResponseMapper.asDTOList(list);
    }
}
