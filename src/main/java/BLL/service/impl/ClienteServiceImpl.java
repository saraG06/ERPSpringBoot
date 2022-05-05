package BLL.service.impl;

import BLL.mapper.dto.request.ClienteRequestDTO;
import BLL.mapper.dto.response.ClienteResponseDTO;
import BLL.mapper.implementation.ClienteRequestMapper;
import BLL.mapper.implementation.ClienteResponseMapper;
import BLL.service.abstraction.ClienteService;
import DAL.Entity.Cliente;
import DAL.Repository.ClienteRepository;
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

    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente a= clienteRequestMapper.asEntity(clienteRequestDTO);
        clienteRepository.save(a);
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
    public List<Cliente> clienti10Contatti() {
        List<Cliente> clienteList= clienteRepository.clienti10Contatti();
        return clienteList;
    }
}
