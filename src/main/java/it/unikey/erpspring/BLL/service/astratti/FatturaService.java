package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {
    void saveFattura(FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<FatturaResponseDTO> findAllFatture();

}
