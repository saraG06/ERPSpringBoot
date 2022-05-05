package BLL.service.implementazioni;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.response.ContattoResponseDTO;
import BLL.mapper.implementazioni.request.ContattoRequestMapper;
import BLL.mapper.implementazioni.response.ContattoResponseMapper;
import BLL.service.astratti.ContattoService;
import DAL.Repository.ContattoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContattoServiceImplementazioni implements ContattoService {

    private final ContattoRepository contattoRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;

    @Override
    public void saveContatto(ContattoRequestDTO contattoRequestDTO) {

    }

    @Override
    public ContattoResponseDTO findbyId(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<ContattoResponseDTO> findAllContatti() {
        return null;
    }
}
