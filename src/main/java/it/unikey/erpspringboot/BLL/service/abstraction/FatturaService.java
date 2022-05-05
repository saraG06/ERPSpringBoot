package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.FatturaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {

    void saveFattura(FatturaRequestDTO fatturaRequestDTO);

    FatturaResponseDTO findById(Long id);

    void deleteFatturaById (Long id);

    List<FatturaResponseDTO> findAllFattura();
}
