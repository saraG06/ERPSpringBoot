package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.ClienteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.ClienteRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.ClienteResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.ClienteService;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
import it.unikey.erpspringboot.DAL.Entity.Contatto;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
import it.unikey.erpspringboot.DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImplementation implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;

    private final OrdineRequestMapper ordineRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;

    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        List<Ordine> listaOrdini = ordineRequestMapper.asEntityList(clienteRequestDTO.getOrdineRequestDTOList());
        List<Contatto> listaContatti = contattoRequestMapper.asEntityList(clienteRequestDTO.getContattoRequestDTOList());
        c.setOrdini(listaOrdini);
        c.setContatti(listaContatti);
        clienteRepository.save(c);
    }

    @Override
    public ClienteResponseDTO findById(Long id) throws NullPointerException{

        Cliente c = clienteRepository.getById(id);
        if(c != null)
            return clienteResponseMapper.asDTO(c);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteClienteById(Long id) throws NullPointerException{

        Cliente c = clienteRepository.getById(id);
        if(c !=null)
            clienteRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<ClienteResponseDTO> findAllCliente() {

        List<Cliente> lista = clienteRepository.findAll();

        return clienteResponseMapper.asDTOList(lista);
    }
}
