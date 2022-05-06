package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.RuoloRequestDTO;
import it.unikey.erpspring.BLL.dto.response.RuoloResponseDTO;

import java.util.List;

public interface RuoloService {
    void saveRuolo(RuoloRequestDTO ruoloRequestDTO);
    RuoloResponseDTO findById(Long id);
    void deleteRuoloById (Long id);
    List<RuoloResponseDTO> findAllRuolo();
}
