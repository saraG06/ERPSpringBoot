package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.DipendenteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.DipendenteResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.DipendenteRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.RisorsaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.RuoloRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.DipendenteResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.DipendenteService;
import it.unikey.erpspringboot.DAL.Entity.Dipendente;
import it.unikey.erpspringboot.DAL.Entity.Risorsa;
import it.unikey.erpspringboot.DAL.Entity.Ruolo;
import it.unikey.erpspringboot.DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DipendenteServiceImplementation implements DipendenteService {

    private final DipendenteRepository dipendenteRepository;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;

    private final RuoloRequestMapper ruoloRequestMapper;
    private final RisorsaRequestMapper risorsaRequestMapper;


    @Override
    public void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO) {
        Dipendente d = dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        Ruolo r = ruoloRequestMapper.asEntity(dipendenteRequestDTO.getRuoloRequestDTO());
        Risorsa ri = risorsaRequestMapper.asEntity(dipendenteRequestDTO.getRisorsaRequestDTO());
        d.setRuolo(r);
        d.setRisorsa(ri);
        dipendenteRepository.save(d);
    }

    @Override
    public DipendenteResponseDTO findById(Long id) throws NullPointerException{

        Dipendente d = dipendenteRepository.getById(id);
        if(d != null)
            return dipendenteResponseMapper.asDTO(d);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteDipendenteById(Long id) throws NullPointerException{
        Dipendente d = dipendenteRepository.getById(id);
        if(d !=null)
            dipendenteRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<DipendenteResponseDTO> findAllDipendente() {

        List<Dipendente> lista = dipendenteRepository.findAll();

        return dipendenteResponseMapper.asDTOList(lista);
    }
}
