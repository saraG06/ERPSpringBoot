package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.AziendaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.OperatoreResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.OperatoreService;
import it.unikey.erpspringboot.DAL.Entity.Azienda;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
import it.unikey.erpspringboot.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatoreServiceImplementation implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;

    private final AziendaRequestMapper aziendaRequestMapper;
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

        return operatoreResponseMapper.asDTOList(lista);
    }
}
