package BLL.service.impl;

import BLL.mapper.dto.request.OrdineRequestDTO;
import BLL.mapper.dto.response.OrdineResponseDTO;
import BLL.mapper.implementation.OrdineRequestMapper;
import BLL.mapper.implementation.OrdineResponseMapper;
import BLL.service.abstraction.OrdineService;
import DAL.Entity.Ordine;
import DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdineServiceImpl implements OrdineService {

    private final OrdineRepository ordineRepository;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;

    @Override
    public void saveOrdine(OrdineRequestDTO ordineRequestDTO) {
        Ordine o= ordineRequestMapper.asEntity(ordineRequestDTO);
        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findById(Long id) {
        Ordine o= ordineRepository.findById(id).get();
        if(o!=null)
            return ordineResponseMapper.asDTO(o);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Ordine o= ordineRepository.findById(id).get();
        if(o!=null)
            ordineRepository.delete(o);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<OrdineResponseDTO> findAllOrdine() {
        List<Ordine> ordineList= ordineRepository.findAll();
        return ordineResponseMapper.asDTOList(ordineList);
    }

    @Override
    public List<OrdineResponseDTO> findOrdiniSenzaFattura() {
        List<Ordine> ordineList= ordineRepository.findOrdiniSenzaFattura();
        return ordineResponseMapper.asDTOList(ordineList);
    }
}
