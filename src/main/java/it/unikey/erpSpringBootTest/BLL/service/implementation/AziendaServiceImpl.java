package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.*;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.*;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.AziendaService;
import it.unikey.erpSpringBootTest.DAL.Entity.*;
import it.unikey.erpSpringBootTest.DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AziendaServiceImpl implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final CollaboratoreResponseMapper collaboratoreResponseMapper;
    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final DipendenteResponseMapper dipendenteResponseMapper;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ClienteRequestMapper clienteRequestMapper;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;

    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        List<Collaboratore> collaboratoreList = collaboratoreRequestMapper.asEntityList(aziendaRequestDTO.getCollaboratoreRequestDTOList());
        List<Dipendente> dipendenteList = dipendenteRequestMapper.asEntityList(aziendaRequestDTO.getDipendenteRequestDTOList());
        List<Cliente> clienteList = clienteRequestMapper.asEntityList(aziendaRequestDTO.getClienteRequestDTOList());
        List<Fattura> fatturaList = fatturaRequestMapper.asEntityList(aziendaRequestDTO.getFatturaRequestDTOList());
        List<Ordine> ordineList = ordineRequestMapper.asEntityList(aziendaRequestDTO.getOrdineRequestDTOList());
        a.setCollaboratori(collaboratoreList);
        a.setDipendenti(dipendenteList);
        a.setClienti(clienteList);
        a.setFatture(fatturaList);
        a.setOrdini(ordineList);
        aziendaRepository.save(a);
    }

    @Override
    public void deleteAziendaById(Long id) {

    }
}
