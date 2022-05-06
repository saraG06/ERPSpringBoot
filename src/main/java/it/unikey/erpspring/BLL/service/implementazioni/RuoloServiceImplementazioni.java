package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.RuoloRequestDTO;
import it.unikey.erpspring.BLL.dto.response.RuoloResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.RuoloRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.RuoloResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.RuoloService;
import it.unikey.erpspring.DAL.Entity.Ruolo;
import it.unikey.erpspring.DAL.Repository.RuoloRepository;
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
