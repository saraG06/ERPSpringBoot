package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.ContattoRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    ContattoResponseDTO findById(Long id);

    void deleteContattoById (Long id);

    List<ContattoResponseDTO> findAllContatto();

}
