package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpspring.BLL.dto.response.OperatoreResponseDTO;

import java.util.List;

public interface OperatoreService {
    void saveOperatore(OperatoreRequestDTO aziendaRequestDTO);
    OperatoreResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<OperatoreResponseDTO> findAllOperatori();
}
