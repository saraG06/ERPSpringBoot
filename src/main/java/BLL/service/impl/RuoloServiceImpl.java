package BLL.service.impl;

import BLL.mapper.dto.request.RuoloRequestDTO;
import BLL.mapper.dto.response.RuoloResponseDTO;
import BLL.mapper.implementation.RuoloRequestMapper;
import BLL.mapper.implementation.RuoloResponseMapper;
import BLL.service.abstraction.RuoloService;
import DAL.Entity.Ruolo;
import DAL.Repository.RuoloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RuoloServiceImpl implements RuoloService {

    private final RuoloRepository ruoloRepository;
    private final RuoloRequestMapper ruoloRequestMapper;
    private final RuoloResponseMapper ruoloResponseMapper;

    @Override
    public void saveRuolo(RuoloRequestDTO ruoloRequestDTO) {
        Ruolo r= ruoloRequestMapper.asEntity(ruoloRequestDTO);
        ruoloRepository.save(r);
    }

    @Override
    public RuoloResponseDTO findById(Long id) {
        Ruolo r= ruoloRepository.findById(id).get();
        if(r!=null)
            return ruoloResponseMapper.asDTO(r);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Ruolo r= ruoloRepository.findById(id).get();
        if(r!=null)
            ruoloRepository.delete(r);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<RuoloResponseDTO> findAllRuolo() {
        List<Ruolo> ruoloList= ruoloRepository.findAll();
        return ruoloResponseMapper.asDTOList(ruoloList);
    }
}
