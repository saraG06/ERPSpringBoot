package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.RisorsaResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.RisorsaRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.RisorsaResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.RisorsaService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Risorsa;
import it.unikey.erpspring.DAL.entity.Worker;
import it.unikey.erpspring.DAL.repository.RisorsaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RisorsaServiceImpl implements RisorsaService {

    private final RisorsaRepository risorsaRepository;
    private final RisorsaRequestMapper risorsaRequestMapper;
    private final RisorsaResponseMapper risorsaResponseMapper;

    @Override
    public void saveRisorsa(RisorsaRequestDTO risorsaRequestDTO) {
        Risorsa r = risorsaRequestMapper.asEntity(risorsaRequestDTO);
        risorsaRepository.save(r);
    }

    @Override
    public RisorsaResponseDTO getRisorsaById(Long id) throws EntityNotFoundException {

        Risorsa o = null;
        if (risorsaRepository.findById(id).isPresent()) {
            o = risorsaRepository.findById(id).get();
        }
        if(o == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return risorsaResponseMapper.asDTO(o);
        }

    }

    @Override
    public void deleteRisorsaById(Long id) throws EntityNotFoundException {
        if(risorsaRepository.findById(id).isPresent()) {
            Risorsa o = risorsaRepository.findById(id).get();
            if (o != null) {
                risorsaRepository.delete(o);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<RisorsaResponseDTO> getAllRisorsa() {
        return risorsaResponseMapper.asDTOList(risorsaRepository.findAll());
    }


}
