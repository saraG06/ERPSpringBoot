package BLL.service.implementazioni;

import BLL.dto.request.AziendaRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.mapper.implementazioni.request.AziendaRequestMapper;
import BLL.mapper.implementazioni.response.AziendaResponseMapper;
import BLL.service.astratti.AziendaService;
import DAL.Entity.Azienda;
import DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AziendaServiceImplementazioni implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;

    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        aziendaRepository.save(a);
    }

    @Override
    public AziendaResponseDTO findbyId(Long id) {
        Azienda a = aziendaRepository.findById(id).get();
        return aziendaResponseMapper.asDTO(a);
    }

    @Override
    public void deleteById(Long id) {
        Azienda a = aziendaRepository.findById(id).get();
        aziendaRepository.delete(a);
    }

    @Override
    public List<AziendaResponseDTO> findAllAziende() {
        List<Azienda> aziendas = aziendaRepository.findAll();
        return aziendaResponseMapper.asDTOList(aziendas);
    }

    @Override
    public List<AziendaResponseDTO> findDipendentiTotali() {
        return findDipendentiTotali();
    }
}
