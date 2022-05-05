package BLL.service.abstraction;

import BLL.dto.Request.FatturaRequestDTO;
import BLL.dto.Response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {

    void saveFattura(FatturaRequestDTO fatturaRequestDTO);

    FatturaResponseDTO findById(Long id);

    void deleteFatturaById (Long id);

    List<FatturaResponseDTO> findAllFattura();
}
