package BLL.service.abstraction;

import BLL.dto.Request.ContattoRequestDTO;
import BLL.dto.Response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    ContattoResponseDTO findById(Long id);

    void deleteContattoById (Long id);

    List<ContattoResponseDTO> findAllContatto();

}
