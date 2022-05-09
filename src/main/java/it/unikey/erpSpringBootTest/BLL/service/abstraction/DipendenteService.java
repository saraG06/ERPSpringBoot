package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.DipendenteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DipendenteService {

    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);

    void deleteDipendenteById(Long id);

    List<DipendenteResponseDTO> findAllDipendentiByAzienda(AziendaRequestDTO aziendaRequestDTO);

    List<DipendenteResponseDTO> findAllDipendentiWithRisorsaAsMacchina();

    //List<DipendenteResponseDTO> findDipendentiEmployedLastMonth();

    void assegnaRisorsa(Long id,Risorse risorse);
}
