package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpspring.BLL.service.astratti.FatturaService;

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