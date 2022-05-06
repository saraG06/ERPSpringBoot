package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.OrdineRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OrdineResponseDTO;
import it.unikey.erpspringboot.DAL.Entity.Ordine;

import java.util.List;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO ordineRequestDTO);

    OrdineResponseDTO findById(Long id);

    void deleteOrdineById (Long id);

    List<OrdineResponseDTO> findAllOrdine();

    List<OrdineResponseDTO> getAllOrdiniSenzaFattura();
}
