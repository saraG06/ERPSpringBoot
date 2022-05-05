package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.RuoloRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RuoloResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.RuoloRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.RuoloResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.RuoloService;
import it.unikey.erpspringboot.DAL.Entity.Ruolo;
import it.unikey.erpspringboot.DAL.Repository.RuoloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RuoloServiceImplementation implements RuoloService {

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
