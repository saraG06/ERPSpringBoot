package BLL.service.astratti;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.ContattoResponseDTO;

import java.util.List;

public interface ContattoService {
    void saveContatto(ContattoRequestDTO contattoRequestDTO);
    ContattoResponseDTO findbyId(Long id);
    void deleteById(Long id);
    List<ContattoResponseDTO> findAllContatti();
}
