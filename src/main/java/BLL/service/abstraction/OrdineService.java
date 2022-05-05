package BLL.service.abstraction;

import BLL.dto.Request.OrdineRequestDTO;
import BLL.dto.Response.OrdineResponseDTO;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO ordineRequestDTO);

    OrdineResponseDTO findById(Long id);

    void deleteOrdineById (Long id);

    List<OrdineResponseDTO> findAllOrdine();
}
