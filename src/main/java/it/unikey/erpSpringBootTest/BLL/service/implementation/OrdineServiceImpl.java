package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ClienteRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ClienteResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OrdineResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.OrdineService;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import it.unikey.erpSpringBootTest.DAL.Repository.OrdineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdineServiceImpl implements OrdineService {

    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;
    private final OrdineRepository ordineRepository;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ClienteRequestMapper clienteRequestMapper;

    @Override
    public void saveOrdine(OrdineRequestDTO ordineRequestDTO) {
        Ordine o = ordineRequestMapper.asEntity(ordineRequestDTO);
        List<Cliente> clienteList = clienteRequestMapper.asEntityList(ordineRequestDTO.getClienteRequestDTOList());
        o.setCliente(clienteList);
        ordineRepository.save(o);
    }

    @Override
    public void deleteOrdineById(Long id) {

    }

    @Override
    public List<OrdineResponseDTO> ordiniWithoutfattura() {
        return ordineRepository.ordiniWithoutfattura();
    }
}
