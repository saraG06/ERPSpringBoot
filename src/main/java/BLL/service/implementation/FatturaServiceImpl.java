package BLL.service.implementation;

import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.response.FatturaResponseDTO;
import BLL.mapper.implementation.ContattoRequestMapper;
import BLL.mapper.implementation.FatturaRequestMapper;
import BLL.mapper.implementation.FatturaResponseMapper;
import BLL.mapper.implementation.OrdineRequestMapper;
import BLL.service.abstraction.FatturaService;
import DAL.Entity.Fattura;
import DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {

    FatturaRepository fatturaRepository;
    FatturaRequestMapper fatturaRequestMapper;
    FatturaResponseMapper fatturaResponseMapper;
    OrdineRequestMapper ordineRequestMapper;
    ContattoRequestMapper contattoRequestMapper;
    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        f.setOrdine(ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO()));
        f.setContatto(contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO()));
        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findById(Long id) {
        return fatturaResponseMapper.asDTO(fatturaRepository.findById(id).get());
    }

    @Override
    public void deleteFatturaById(Long id) {
        fatturaRepository.deleteById(id);
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {
        return fatturaResponseMapper.asDTOList(fatturaRepository.findAll());
    }
}
