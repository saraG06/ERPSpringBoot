package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO2;
import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.AziendaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OperatoreRequestMapper2;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.AziendaResponseMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.AziendaResponseMapper2;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.OperatoreResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.OperatoreService;
import it.unikey.erpspringboot.DAL.Entity.Azienda;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
import it.unikey.erpspringboot.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatoreServiceImplementation implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreRequestMapper2 operatoreRequestMapper2;
    private final OperatoreResponseMapper operatoreResponseMapper;

    private final AziendaRequestMapper aziendaRequestMapper;

    private final AziendaResponseMapper2 aziendaResponseMapper2;
    private final AziendaResponseMapper aziendaResponseMapper;
    private final OrdineRequestMapper ordineRequestMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper.asEntity(operatoreRequestDTO);
        Azienda a = aziendaRequestMapper.asEntity(operatoreRequestDTO.getAziendaRequestDTO());
        List<Ordine> listaOrdini = ordineRequestMapper.asEntityList(operatoreRequestDTO.getOrdineRequestDTOList());
        o.setAzienda(a);
        o.setOrdini(listaOrdini);
        operatoreRepository.save(o);
    }

    @Override
    public void saveOperatoreSenzaAzienda(OperatoreRequestDTO2 operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper2.asEntity(operatoreRequestDTO);
        Azienda a = aziendaResponseMapper2.asDTO(operatoreRequestDTO.getAziendaResponseDTO());
        o.setAzienda(a);
        operatoreRepository.save(o);
    }

    @Override
    public OperatoreResponseDTO findById(Long id) throws NullPointerException{

        Operatore o = operatoreRepository.getById(id);
        if(o != null)
            return operatoreResponseMapper.asDTO(o);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteOperatoreById(Long id) throws NullPointerException {
        Operatore o = operatoreRepository.getById(id);
        if(o !=null)
            operatoreRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<OperatoreResponseDTO> findAllOperatore() {

        List<Operatore> lista = operatoreRepository.findAll();
        List<OperatoreResponseDTO> listaDTO = operatoreResponseMapper.asDTOList(lista);
        for(OperatoreResponseDTO o : listaDTO){
            for(Operatore op : lista){
                o.setAziendaResponseDTO(aziendaResponseMapper.asDTO(op.getAzienda()));
            }
        }

        return listaDTO;
    }

    @Override
    public List<OperatoreResponseDTO> getAllAssuntiUltimoMese(LocalDate now) {
        List<Operatore> lista = operatoreRepository.getAllAssuntiUltimoMese(now);
        return operatoreResponseMapper.asDTOList(lista);
    }
}
