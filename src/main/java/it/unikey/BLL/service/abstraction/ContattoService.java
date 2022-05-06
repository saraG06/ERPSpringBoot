package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.mapper.dto.request.ContattoRequestDTO;
import it.unikey.BLL.mapper.dto.response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    ContattoResponseDTO findById(Long id);

    void deleteById(Long id);

    List<ContattoResponseDTO> findAllContatto();

}
