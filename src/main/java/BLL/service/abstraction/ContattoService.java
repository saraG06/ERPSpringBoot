package BLL.service.abstraction;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.ContattoResponseDTO;
import BLL.dto.response.DipendenteResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);
    ContattoResponseDTO findById(Long id) ;
    void deleteContattoById(Long id) ;
    List<ContattoResponseDTO> findAllContatto();
}
