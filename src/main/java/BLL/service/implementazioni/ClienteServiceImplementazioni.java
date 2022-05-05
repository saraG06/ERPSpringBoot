package BLL.service.implementazioni;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.mapper.implementazioni.request.ClienteRequestMapper;
import BLL.mapper.implementazioni.response.ClienteResponseMapper;
import BLL.service.astratti.ClienteService;
import DAL.Entity.Cliente;
import DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImplementazioni implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;

    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        clienteRepository.save(c);
    }

    @Override
    public ClienteResponseDTO findbyId(Long id) {
        Cliente c = clienteRepository.findById(id).get();
        return clienteResponseMapper.asDTO(c);
    }

    @Override
    public void deleteById(Long id) {
        Cliente c = clienteRepository.findById(id).get();
        clienteRepository.delete(c);
    }

    @Override
    public List<ClienteResponseDTO> findAllClienti() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clienteResponseMapper.asDTOList(clientes);
    }
}
