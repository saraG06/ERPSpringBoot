package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpspring.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpspring.BLL.dto.response.OrdineResponseDTO;

import java.util.List;

public interface OrdineService {
    void saveOrdine(OrdineRequestDTO ordineRequestDTO);
    OrdineResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<OrdineResponseDTO> findAllOridni();
    List<FatturaResponseDTO> fattureNonPresenti();
}
