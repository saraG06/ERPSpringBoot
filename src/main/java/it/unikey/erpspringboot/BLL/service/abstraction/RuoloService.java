package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.RuoloRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RuoloResponseDTO;

import java.util.List;

public interface RuoloService {

    void saveRuolo(RuoloRequestDTO ruoloRequestDTO);

    RuoloResponseDTO findById(Long id);

    void deleteRuoloById (Long id);

    List<RuoloResponseDTO> findAllRuolo();
}
