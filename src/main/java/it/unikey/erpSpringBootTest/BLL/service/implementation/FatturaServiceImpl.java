package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ClienteRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.FatturaRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ClienteResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ContattoResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.FatturaResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OrdineResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.FatturaService;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import it.unikey.erpSpringBootTest.DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FatturaServiceImpl implements FatturaService {

    private final FatturaRepository fatturaRepository;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;
    private final ContattoResponseMapper contattoResponseMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    private final OrdineResponseMapper ordineResponseMapper;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;

    @Override
    public void saveFattura(FatturaRequestDTO fatturaRequestDTO) {
        Fattura f = fatturaRequestMapper.asEntity(fatturaRequestDTO);
        Contatto c = contattoRequestMapper.asEntity(fatturaRequestDTO.getContattoRequestDTO());
        Ordine o = ordineRequestMapper.asEntity(fatturaRequestDTO.getOrdineRequestDTO());
        f.setContatto(c);
        f.setOrdine(o);
        fatturaRepository.save(f);
    }

    @Override
    public void deleteFatturaById(Long id) {

    }

    @Override
    public List<FatturaResponseDTO> findAllFattureByCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        return fatturaRepository.findAllFattureByCliente(c);
    }

    @Override
    public List<FatturaResponseDTO> findAllFattureAfter2019() {
        return fatturaRepository.findAllFattureAfter2019();
    }


}
