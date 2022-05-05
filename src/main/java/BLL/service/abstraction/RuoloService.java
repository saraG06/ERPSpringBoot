package BLL.service.abstraction;

import BLL.dto.Request.RuoloRequestDTO;
import BLL.dto.Response.RuoloResponseDTO;

import java.util.List;

public interface RuoloService {

    void saveRuolo(RuoloRequestDTO ruoloRequestDTO);

    RuoloResponseDTO findById(Long id);

    void deleteRuoloById (Long id);

    List<RuoloResponseDTO> findAllRuolo();
}
