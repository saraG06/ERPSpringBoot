package BLL.service.implementazioni;

import BLL.dto.request.RuoloRequestDTO;
import BLL.dto.response.RuoloResponseDTO;
import BLL.mapper.implementazioni.request.RuoloRequestMapper;
import BLL.mapper.implementazioni.response.RuoloResponseMapper;
import BLL.service.astratti.RuoloService;
import BLL.Entity.Ruolo;
import DAL.Repository.RuoloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RuoloServiceImplementazioni implements RuoloService {

    private final RuoloRepository ruoloRepository;
    private final RuoloRequestMapper ruoloRequestMapper;
    private final RuoloResponseMapper ruoloResponseMapper;

    @Override
    public void saveRuolo(RuoloRequestDTO ruoloRequestDTO) {
        Ruolo r = ruoloRequestMapper.asEntity(ruoloRequestDTO);
        ruoloRepository.save(r);
    }

    @Override
    public RuoloResponseDTO findById(Long id) throws NullPointerException{
        Ruolo r = ruoloRepository.getById(id);
        if(r != null)
            return ruoloResponseMapper.asDTO(r);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteRuoloById(Long id) throws NullPointerException{
        Ruolo r = ruoloRepository.getById(id);
        if(r !=null)
            ruoloRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<RuoloResponseDTO> findAllRuolo() {
        List<Ruolo> lista = ruoloRepository.findAll();
        return ruoloResponseMapper.asDTOList(lista);
    }
}
