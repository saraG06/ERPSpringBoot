package BLL.service.astratti;

import BLL.dto.request.RuoloRequestDTO;
import BLL.dto.response.RuoloResponseDTO;

import java.util.List;

public interface RuoloService {
    void saveRuolo(RuoloRequestDTO ruoloRequestDTO);
    RuoloResponseDTO findById(Long id);
    void deleteRuoloById (Long id);
    List<RuoloResponseDTO> findAllRuolo();
}
