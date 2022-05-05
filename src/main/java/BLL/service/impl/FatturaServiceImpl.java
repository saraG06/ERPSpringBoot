package BLL.service.impl;

import BLL.mapper.dto.request.FatturaRequestDTO;
import BLL.mapper.dto.response.FatturaResponseDTO;
import BLL.mapper.implementation.FatturaRequestMapper;
import BLL.mapper.implementation.FatturaResponseMapper;
import BLL.service.abstraction.FatturaService;
import DAL.Entity.Fattura;
import DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {

    private final FatturaRepository fatturaRepository;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;

    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f= fatturaRequestMapper.asEntity(fatturaRequestDTO);
        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findById(Long id) {
        Fattura c= fatturaRepository.findById(id).get();
        if(c!=null)
            return fatturaResponseMapper.asDTO(c);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Fattura f= fatturaRepository.findById(id).get();
        if(f!=null)
            fatturaRepository.delete(f);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {
        List<Fattura> fatturaList= fatturaRepository.findAll();
        return fatturaResponseMapper.asDTOList(fatturaList);
    }

    @Override
    public List<FatturaResponseDTO> findFattureReply() {
        List<Fattura> fatturaList= fatturaRepository.findFattureReply();
        return fatturaResponseMapper.asDTOList(fatturaList);
    }

    @Override
    public List<FatturaResponseDTO> findAfter31122019() {
        List<Fattura> fatturaList= fatturaRepository.findAfter31122019();
        return fatturaResponseMapper.asDTOList(fatturaList);
    }

}
