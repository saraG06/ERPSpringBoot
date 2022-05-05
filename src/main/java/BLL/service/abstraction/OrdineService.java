package BLL.service.abstraction;

import BLL.mapper.dto.request.OrdineRequestDTO;
import BLL.mapper.dto.response.OrdineResponseDTO;
import DAL.Entity.Ordine;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO ordineRequestDTO);

    OrdineResponseDTO findById(Long id);

    void deleteById(Long id);

    List<OrdineResponseDTO> findAllOrdine();

    List<OrdineResponseDTO> ordiniSenzaFattura();
}
