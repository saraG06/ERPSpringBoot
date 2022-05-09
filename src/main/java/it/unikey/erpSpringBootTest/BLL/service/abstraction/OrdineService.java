package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO ordineRequestDTO);

    void deleteOrdineById(Long id);

    List<OrdineResponseDTO> ordiniWithoutfattura();
}
