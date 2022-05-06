package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.RisorseResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.RisorsaRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.RisorseResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.RisorsaService;
import it.unikey.erpspring.DAL.Entity.Risorsa;
import it.unikey.erpspring.DAL.Repository.RisorsaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RisorsaServiceImplementazioni implements RisorsaService {
    private final RisorsaRepository risorsaRepository;
    private final RisorsaRequestMapper risorsaRequestMapper;
    private final RisorseResponseMapper risorsaResponseMapper;

    @Override
    public void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r = risorsaRequestMapper.asEntity(risorsaRequestDTO);
        risorsaRepository.save(r);
    }

    @Override
    public RisorseResponseDTO findById(Long id) throws NullPointerException{
        Risorsa r = risorsaRepository.getById(id);
        if(r != null)
            return risorsaResponseMapper.asDTO(r);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteRisorsaById(Long id) throws NullPointerException{
        Risorsa r = risorsaRepository.getById(id);
        if(r !=null)
            risorsaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<RisorseResponseDTO> findAllRisorsa() {
        List<Risorsa> lista = risorsaRepository.findAll();
        return risorsaResponseMapper.asDTOList(lista);
    }
}
