package BLL.service.implementation;

import BLL.dto.Request.ClienteRequestDTO;
import BLL.dto.Response.ClienteResponseDTO;
import BLL.mapper.implementation.request.*;
import BLL.mapper.implementation.response.AziendaResponseMapper;
import BLL.mapper.implementation.response.ClienteResponseMapper;
import BLL.service.abstraction.ClienteService;
import DAL.Entity.Azienda;
import DAL.Entity.Cliente;
import DAL.Entity.Contatto;
import DAL.Entity.Ordine;
import DAL.Repository.ClienteRepository;
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
