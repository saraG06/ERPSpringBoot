package BLL.service.abstraction;

import BLL.mapper.dto.request.ContattoRequestDTO;
import BLL.mapper.dto.response.ContattoResponseDTO;
import BLL.mapper.dto.response.FatturaResponseDTO;
import DAL.Entity.Contatto;

import java.util.List;

public interface ContattoService {

    void saveContatto(ContattoRequestDTO contattoRequestDTO);

    ContattoResponseDTO findById(Long id);

    void deleteById(Long id);

    List<ContattoResponseDTO> findAllContatto();

    List<FatturaResponseDTO> findAllFatturaContatto(ContattoRequestDTO c);       //id del contatto
}
