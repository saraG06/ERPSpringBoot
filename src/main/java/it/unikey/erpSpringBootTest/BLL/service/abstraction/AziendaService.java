package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;

public interface AziendaService {

    void saveAzienda(AziendaRequestDTO aziendaRequestDTO);

    void deleteAziendaById(Long id);
}
