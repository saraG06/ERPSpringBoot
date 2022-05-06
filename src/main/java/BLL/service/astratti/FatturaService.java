package BLL.service.astratti;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.dto.response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {
    void saveFattura(FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<FatturaResponseDTO> findAllFatture();

}
