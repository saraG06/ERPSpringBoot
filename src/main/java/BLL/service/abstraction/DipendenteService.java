package BLL.service.abstraction;

import BLL.mapper.dto.request.ContattoRequestDTO;
import BLL.mapper.dto.request.DipendenteRequestDTO;
import BLL.mapper.dto.request.RuoloRequestDTO;
import BLL.mapper.dto.response.DipendenteResponseDTO;
import DAL.Entity.Contatto;
import DAL.Entity.Dipendente;

import java.time.LocalDate;
import java.util.List;

public interface DipendenteService {

    void saveDipendente(DipendenteRequestDTO dipendenteRequestDTO);

    DipendenteResponseDTO findById(Long id);

    void deleteById(Long id);

    List<DipendenteResponseDTO> findAllDipendente();

    List<DipendenteResponseDTO> ultimiDipendentiAssunti(LocalDate now);

    List<Dipendente> dipendentiConMacchina();
}
