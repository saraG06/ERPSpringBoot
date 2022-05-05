package BLL.service.abstraction;

import BLL.dto.request.OrdineRequestDTO;
import BLL.dto.response.OrdineResponseDTO;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO autoRequestDTO);

    OrdineResponseDTO findById(Long id) ;
    void deleteOrdineById(Long id) ;
    List<OrdineResponseDTO> findAllOrdine();
}
