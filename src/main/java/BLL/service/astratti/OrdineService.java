package BLL.service.astratti;

import BLL.dto.request.OrdineRequestDTO;
import BLL.dto.response.OrdineResponseDTO;

import java.util.List;

public interface OrdineService {
    void saveOrdine(OrdineRequestDTO ordineRequestDTO);
    OrdineResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<OrdineResponseDTO> findAllOridni();
}
