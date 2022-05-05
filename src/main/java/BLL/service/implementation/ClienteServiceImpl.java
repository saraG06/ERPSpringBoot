package BLL.service.implementation;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.mapper.implementation.ClienteRequestMapper;
import BLL.mapper.implementation.ClienteResponseMapper;
import BLL.mapper.implementation.ContattoRequestMapper;
import BLL.service.abstraction.ClienteService;
import DAL.Entity.Cliente;
import DAL.Entity.persone.Contatto;
import DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ClienteRepository clienteRepository;
    private final ContattoRequestMapper contattoRequestMapper;
    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        List<Contatto> list = contattoRequestMapper.asEntityList(clienteRequestDTO.getContattoRequestDTOList());
        c.setContatti(list);
        clienteRepository.save(c);
    }

    @Override
    public ClienteResponseDTO findById(Long id) {
        return clienteResponseMapper.asDTO(clienteRepository.findById(id).get());
    }

    @Override
    public void deleteClienteById(Long id) {
        if(clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        }
    }

    @Override
    public List<ClienteResponseDTO> findAllCliente() {
        return clienteResponseMapper.asDTOList(clienteRepository.findAll());
    }
}
