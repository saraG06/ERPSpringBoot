package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpspring.BLL.dto.response.ContattoResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.ContattoRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.ContattoResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.ContattoService;
import it.unikey.erpspring.DAL.Repository.ContattoRepository;
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
