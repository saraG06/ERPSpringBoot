package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.ClienteRequestDTO;
import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.BLL.mapper.implementation.ClienteRequestMapper;
import it.unikey.BLL.mapper.implementation.ClienteResponseMapper;
import it.unikey.BLL.mapper.implementation.ContattoRequestMapper;
import it.unikey.BLL.mapper.implementation.OrdineRequestMapper;
import it.unikey.BLL.service.abstraction.ClienteService;
import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Entity.Ordine;
import it.unikey.DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final OrdineRequestMapper ordineRequestMapper;
    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c= clienteRequestMapper.asEntity(clienteRequestDTO);
        List<Contatto> listaContatti= contattoRequestMapper.asEntityList(clienteRequestDTO.getListaContattoRequestDTO());
        List<Ordine> listaOrdini= ordineRequestMapper.asEntityList(clienteRequestDTO.getListaOrdineRequestDTO());
        c.setListaContatti(listaContatti);
        c.setListaOrdini(listaOrdini);
        clienteRepository.save(c);
    }

    @Override
    public ClienteResponseDTO findById(Long id) {
        Cliente a= clienteRepository.findById(id).get();
        if(a!=null)
            return clienteResponseMapper.asDTO(a);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Cliente a= clienteRepository.findById(id).get();
        if(a!=null)
            clienteRepository.delete(a);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<ClienteResponseDTO> findAllCliente() {
        List<Cliente> clienteList= clienteRepository.findAll();
        return clienteResponseMapper.asDTOList(clienteList);
    }

    @Override
    public List<ClienteResponseDTO> clienti10Contatti() {
        List<Cliente> clienteList= clienteRepository.clienti10Contatti();
        return clienteResponseMapper.asDTOList(clienteList);
    }
}
