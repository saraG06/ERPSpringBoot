package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ClienteRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.ContattoRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ClienteResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.ContattoResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.ClienteService;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import it.unikey.erpSpringBootTest.DAL.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteRequestMapper clienteRequestMapper;
    private final ClienteResponseMapper clienteResponseMapper;
    private final ContattoRequestMapper contattoRequestMapper;
    private final ContattoResponseMapper contattoResponseMapper;

    @Override
    public void saveCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente c = clienteRequestMapper.asEntity(clienteRequestDTO);
        List<Contatto> contattoList = contattoRequestMapper.asEntityList(clienteRequestDTO.getContattoRequestDTOList());
        c.setContatti(contattoList);
        clienteRepository.save(c);
    }

    @Override
    public void deleteClienteById(Long id) {

    }

    @Override
    public List<ClienteResponseDTO> findAllClientiWithMoreThan10Contatti() {
        return clienteRepository.findAllClientiWithMoreThan10Contatti();
    }
}
