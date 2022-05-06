package BLL.service.implementazioni;

import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.response.FatturaResponseDTO;
import BLL.service.astratti.FatturaService;

import java.util.List;

public class FatturaServiceImplememntazioni implements FatturaService {
    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {

    }

    @Override
    public FatturaResponseDTO findbyId(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<FatturaResponseDTO> findAllFatture() {
        return null;
    }
}
