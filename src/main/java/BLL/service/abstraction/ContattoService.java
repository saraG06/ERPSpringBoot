package BLL.service.abstraction;

import BLL.mapper.dto.request.ContattoRequestDTO;
import BLL.mapper.dto.response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    ContattoResponseDTO findById(Long id);

    void deleteById(Long id);

    List<ContattoResponseDTO> findAllContatto();

}
