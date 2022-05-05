package BLL.service.implementation;

import BLL.dto.Request.OrdineRequestDTO;
import BLL.dto.Response.OrdineResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.OrdineResponseMapper;
import BLL.service.abstraction.OrdineService;
import DAL.Entity.*;
import DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdineServiceImplementation implements OrdineService {

    private final OrdineRepository ordineRepository;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;

    private final OperatoreRequestMapper operatoreRequestMapper;
    private final ClienteRequestMapper clienteRequestMapper;


    @Override
    public void saveOrdine(OrdineRequestDTO ordineRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(ordineRequestDTO);
        Operatore operatore = operatoreRequestMapper.asEntity(ordineRequestDTO.getOperatoreRequestDTO());
        Cliente c = clienteRequestMapper.asEntity(ordineRequestDTO.getClienteRequestDTO());
        o.setOperatore(operatore);
        o.setCliente(c);
        ordineRepository.save(o);
    }

    @Override
    public OrdineResponseDTO findById(Long id) throws NullPointerException{

        Ordine o = ordineRepository.getById(id);
        if(o != null)
            return ordineResponseMapper.asDTO(o);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteOrdineById(Long id) throws NullPointerException{
        Ordine o = ordineRepository.getById(id);
        if(o !=null)
            ordineRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<OrdineResponseDTO> findAllOrdine() {

        List<Ordine> lista = ordineRepository.findAll();

        return ordineResponseMapper.asDTOList(lista);
    }
}
