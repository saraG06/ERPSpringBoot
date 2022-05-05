package BLL.service.implementation;

import BLL.dto.Request.FatturaRequestDTO;
import BLL.dto.Response.FatturaResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.FatturaResponseMapper;
import BLL.service.abstraction.FatturaService;
import DAL.Entity.*;
import DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FatturaServiceImplementation implements FatturaService {

    private final FatturaRepository fatturaRepository;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;

    private final OrdineRequestMapper ordineRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;

    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        Contatto c = contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO());
        Ordine o = ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO());
        f.setContatto(c);
        f.setOrdine(o);
        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findById(Long id) throws NullPointerException{

        Fattura f = fatturaRepository.getById(id);
        if(f != null)
            return fatturaResponseMapper.asDTO(f);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteFatturaById(Long id) throws NullPointerException{
        Fattura f = fatturaRepository.getById(id);
        if(f !=null)
            fatturaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {

        List<Fattura> lista = fatturaRepository.findAll();

        return fatturaResponseMapper.asDTOList(lista);
    }
}
