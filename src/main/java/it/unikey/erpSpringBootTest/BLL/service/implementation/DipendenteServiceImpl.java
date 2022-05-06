package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.DipendenteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.AziendaRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.DipendenteRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.AziendaResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.DipendenteResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OperatoreResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.DipendenteService;
import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import it.unikey.erpSpringBootTest.DAL.Repository.DipendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DipendenteServiceImpl implements DipendenteService {

    private final DipendenteRepository dipendenteRepository;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;
    private final AziendaResponseMapper aziendaResponseMapper;
    private final AziendaRequestMapper aziendaRequestMapper;

    @Override
    public void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO) {
        Dipendente d = dipendenteRequestMapper.asEntity(dipendenteRequestDTO);
        Operatore o = operatoreRequestMapper.asEntity(dipendenteRequestDTO.getOperatoreRequestDTO());
        d.setOperatore(o);
        dipendenteRepository.save(d);
    }

    @Override
    public void deleteDipendenteById(Long id) {

    }

    @Override
    public List<Dipendente> findAllDipendentiByAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        return dipendenteRepository.findAllDipendentiByAzienda(a);
    }

    @Override
    public List<Dipendente> findAllDipendentiWithRisorsaAsMacchina() {
        return dipendenteRepository.findAllDipendentiWithRisorsaAsMacchina();
    }
}
