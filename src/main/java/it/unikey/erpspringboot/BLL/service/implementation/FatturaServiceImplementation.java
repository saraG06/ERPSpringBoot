package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.FatturaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.FatturaRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.FatturaResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.FatturaService;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
import it.unikey.erpspringboot.DAL.Entity.Contatto;
import it.unikey.erpspringboot.DAL.Entity.Fattura;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
import it.unikey.erpspringboot.DAL.Repository.FatturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FatturaServiceImplementation implements FatturaService {

    private final FatturaRepository fatturaRepository;
    private final FatturaRequestMapper fatturaRequestMapper;
    private final FatturaResponseMapper fatturaResponseMapper;

    private final OrdineRequestMapper ordineRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;

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
    public FatturaResponseDTO findById(Long id) throws NullPointerException{

        Fattura f = fatturaRepository.getById(id);
        if(f != null)
            return fatturaResponseMapper.asDTO(f);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteFatturaById(Long id) throws NullPointerException{
        Fattura f = fatturaRepository.getById(id);
        if(f !=null)
            fatturaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<FatturaResponseDTO> findAllFattura() {

        List<Fattura> lista = fatturaRepository.findAll();

        return fatturaResponseMapper.asDTOList(lista);
    }

    @Override
    public List<FatturaResponseDTO> getAllFattureEmesseDopo31_12_2019() {
        List<Fattura> lista = fatturaRepository.getAllFattureEmesseDopo31_12_2019();
        return fatturaResponseMapper.asDTOList(lista);
    }

    @Override
    public List<FatturaResponseDTO> getAllFattureClienteReply() {
        List<Fattura> lista = fatturaRepository.getAllFattureClienteReply();
        return fatturaResponseMapper.asDTOList(lista);

    }

    @Override
    public List<FatturaResponseDTO> getAllFattureCliente(Cliente cliente) {
        List<Fattura> lista = fatturaRepository.getAllFattureCliente(cliente);
        return fatturaResponseMapper.asDTOList(lista);
    }
}
