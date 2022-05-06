package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpspring.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpspring.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.OrdineRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.OrdineResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.OrdineService;
import it.unikey.erpspring.DAL.Entity.Ordine;
import it.unikey.erpspring.DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdineServiceImplementazioni implements OrdineService {

    private final OrdineRepository ordineRepository;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;

    @Override
    public void saveOrdine(OrdineRequestDTO ordineRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(ordineRequestDTO);
        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findbyId(Long id) {
        Ordine o = ordineRepository.findById(id).get();
        return ordineResponseMapper.asDTO(o);
    }

    @Override
    public void deleteById(Long id) {
        Ordine o = ordineRepository.findById(id).get();
        ordineRepository.delete(o);
    }

    @Override
    public List<OrdineResponseDTO> findAllOridni() {
        List<Ordine> ordines = ordineRepository.findAll();
        return ordineResponseMapper.asDTOList(ordines);
    }

    @Override
    public List<FatturaResponseDTO> fattureNonPresenti() {
        return fattureNonPresenti();
    }
}
