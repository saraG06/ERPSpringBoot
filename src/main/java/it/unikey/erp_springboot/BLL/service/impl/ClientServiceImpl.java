package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientResponseMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.ClientService;
import it.unikey.erp_springboot.DAL.Entity.Client;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientRequestMapper clientRequestMapper;
    private final ClientResponseMapper clientResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;
    @Override
    public void saveClient(ClientRequestDTO clientRequestDTO) {
        Client c = clientRequestMapper.asEntity(clientRequestDTO);
        Company com = companyRequestMapper.asEntity(clientRequestDTO.getCompanyRequestDTO());
        c.setCompany(com);
        clientRepository.save(c);
    }

    @Override
    public ClientResponseDTO findById(Long id) {
        Client c = clientRepository.getById(id);
        if(c != null){
            return clientResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteClientById(Long id) {
        if(clientRepository.existsById(id)){
            clientRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<ClientResponseDTO> findAllClient() {
        List<Client> list = clientRepository.findAll();
        return clientResponseMapper.asDTOList(list);
    }
}
