package BLL.service.abstraction;

import BLL.mapper.dto.request.ContattoRequestDTO;
import BLL.mapper.dto.request.FatturaRequestDTO;
import BLL.mapper.dto.response.FatturaResponseDTO;

import java.util.List;

public interface FatturaService {

    void saveFattura(FatturaRequestDTO fatturaRequestDTO);

    FatturaResponseDTO findById(Long id);

    void deleteById(Long id);

    List<FatturaResponseDTO> findAllFattura();

    List<FatturaResponseDTO> findFattureReply();

    List<FatturaResponseDTO> findAfter31122019();

    List<FatturaResponseDTO> findAllFatturaContatto(ContattoRequestDTO contattoRequestDTO);       //id del contatto
}
