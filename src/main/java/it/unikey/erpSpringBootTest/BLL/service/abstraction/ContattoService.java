package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.ContattoRequestDTO;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    void deleteContattoById(Long id);
}
