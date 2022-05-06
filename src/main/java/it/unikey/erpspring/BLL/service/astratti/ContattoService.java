package it.unikey.erpspring.BLL.service.astratti;

import it.unikey.erpspring.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpspring.BLL.dto.response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {
    void saveContatto(ContattoRequestDTO contattoRequestDTO);
    ContattoResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<ContattoResponseDTO> findAllContatti();
}
