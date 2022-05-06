package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.RuoloRequestDTO;
import it.unikey.BLL.mapper.dto.response.RuoloResponseDTO;
import it.unikey.BLL.mapper.implementation.RuoloRequestMapper;
import it.unikey.BLL.mapper.implementation.RuoloResponseMapper;
import it.unikey.BLL.service.abstraction.RuoloService;
import it.unikey.DAL.Entity.Ruolo;
import it.unikey.DAL.Repository.RuoloRepository;
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
