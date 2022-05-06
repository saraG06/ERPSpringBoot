package BLL.service.implementation;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.request.OrdineRequestDTO;
import BLL.dto.response.FatturaResponseDTO;
import BLL.mapper.implementation.ContattoRequestMapper;
import BLL.mapper.implementation.FatturaRequestMapper;
import BLL.mapper.implementation.FatturaResponseMapper;
import BLL.mapper.implementation.OrdineRequestMapper;
import BLL.service.abstraction.FatturaService;
import DAL.Entity.Fattura;
import DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {

    FatturaRepository fatturaRepository;
    FatturaRequestMapper fatturaRequestMapper;
    FatturaResponseMapper fatturaResponseMapper;
    OrdineRequestMapper ordineRequestMapper;
    ContattoRequestMapper contattoRequestMapper;
    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        f.setOrdine(ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO()));
        f.setContatto(contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO()));
        fatturaRepository.save(f);
    }

    @Override
    public FatturaResponseDTO findById(Long id) {
        return fatturaResponseMapper.asDTO(fatturaRepository.findById(id).get());
    }

    @Override
    public void deleteFatturaById(Long id) {
        fatturaRepository.deleteById(id);
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {
        return fatturaResponseMapper.asDTOList(fatturaRepository.findAll());
    }

    public List<FatturaResponseDTO> findFattureDopo2019() {
        return fatturaResponseMapper.asDTOList(fatturaRepository.dopo2019(LocalDate.parse("2019-12-31")));
    }

    public List<FatturaResponseDTO> findFattureReply() {
        List<Fattura> list = fatturaRepository.fattureCliente("Reply");
        return  fatturaResponseMapper.asDTOList(list);
    }

    public List<FatturaResponseDTO> findFattureAziendaContatto(ContattoRequestDTO c) {
        List<Fattura> list = fatturaRepository.fattureCliente(c.getClienteRequestDTO().getNome());
        return  fatturaResponseMapper.asDTOList(list);
    }

    public void fatturaDaContatto(ContattoRequestDTO c, OrdineRequestDTO o,LocalDate date) {
        FatturaRequestDTO f = new FatturaRequestDTO();
        f.setContattoRequestDTO(c);
        f.setOrdineRequestDTO(o);
        f.setData(date);
        saveFattura(f);
    }

}
