package BLL.service.implementation;

import BLL.dto.request.OrdineRequestDTO;
import BLL.dto.response.OrdineResponseDTO;
import BLL.mapper.implementation.OperatoreRequestMapper;
import BLL.mapper.implementation.OrdineRequestMapper;
import BLL.mapper.implementation.OrdineResponseMapper;
import BLL.service.abstraction.OrdineService;
import DAL.Entity.Ordine;
import DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdineServiceImpl implements OrdineService {

    OrdineRepository ordineRepository;
    OrdineRequestMapper ordineRequestMapper;
    OrdineResponseMapper ordineResponseMapper;
    OperatoreRequestMapper operatoreRequestMapper;
    @Override
    public void saveOrdine(OrdineRequestDTO autoRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(autoRequestDTO);
        o.setOperatore(operatoreRequestMapper.asEntity(autoRequestDTO.getOperatoreRequestDTO()));
        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findById(Long id) {
        return ordineResponseMapper.asDTO(ordineRepository.findById(id).get());
    }

    @Override
    public void deleteOrdineById(Long id) {
        ordineRepository.deleteById(id);
    }

    @Override
    public List<OrdineResponseDTO> findAllOrdine() {
        return ordineResponseMapper.asDTOList(ordineRepository.findAll());
    }

    @Override
    public List<OrdineResponseDTO> findOrdiniSenzaFattura() {
        List<Ordine> fatturati = ordineRepository.ordiniFatturati();
        List<Ordine> tutti = ordineRepository.findAll() ;
        List<Ordine> nonFatturati = tutti.stream().filter(o -> !fatturati.contains(o)).collect(Collectors.toList()) ;
        return  ordineResponseMapper.asDTOList(nonFatturati) ;
    }
}
