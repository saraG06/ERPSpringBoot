package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.OrdineRequestDTO;

public interface OrdineService {

    void saveOrdine(OrdineRequestDTO ordineRequestDTO);

    void deleteOrdineById(Long id);
}
