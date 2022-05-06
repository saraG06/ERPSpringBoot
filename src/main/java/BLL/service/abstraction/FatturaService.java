package BLL.service.abstraction;

import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.request.OperatoreRequestDTO;
import BLL.dto.response.FatturaResponseDTO;
import BLL.dto.response.OperatoreResponseDTO;
import DAL.Entity.Fattura;

import java.util.List;

public interface FatturaService {
    void saveFattura(FatturaRequestDTO fatturaRequestDTO);
    FatturaResponseDTO findById(Long id) ;
    void deleteFatturaById(Long id) ;
    List<FatturaResponseDTO> findAllFattura();

    public List<FatturaResponseDTO> findFattureDopo2019();
    public List<FatturaResponseDTO> findFattureReply();
}
