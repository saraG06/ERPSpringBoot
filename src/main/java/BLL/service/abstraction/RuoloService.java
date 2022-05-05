package BLL.service.abstraction;

import BLL.mapper.dto.request.DipendenteRequestDTO;
import BLL.mapper.dto.request.RuoloRequestDTO;
import BLL.mapper.dto.response.RuoloResponseDTO;

import java.util.List;

public interface RuoloService {

    void saveRuolo(RuoloRequestDTO ruoloRequestDTO);

    RuoloResponseDTO findById(Long id);

    void deleteById(Long id);

    List<RuoloResponseDTO> findAllRuolo();

    void assegnaRuolo(DipendenteRequestDTO capo, DipendenteRequestDTO dip, RuoloRequestDTO ruoloRequestDTO);
}
