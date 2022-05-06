package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.ClientRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ClientResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.ClientResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.ClientService;
import it.unikey.ERPSpringBoot.DAL.Entity.Client;
import it.unikey.ERPSpringBoot.DAL.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientRequestMapper clientRequestMapper;
    private final ClientResponseMapper clientResponseMapper;

    @Override
    public List<ClientResponseDto> clientsContactGreater10() {

        List<Client>cl1 = clientRepository.clientsContactGreater10();
        return clientResponseMapper.asDTOList(cl1);
    }

    @Override
    public List<Client> findAllById(Long id) {
        return null;
    }

    @Override
    public List<Client> findAllByName(String name) {
        return null;
    }

    @Override
    public List<Client> findAllByIVA(String Iva) {
        return null;
    }

    @Override
    public void saveClient(ClientRequestDto clientRequestDto) {

        Client c = clientRequestMapper.asEntity(clientRequestDto);
        clientRepository.save(c);

    }

    @Override
    public ClientResponseDto findById(Long id) {
        return null;
    }
}
