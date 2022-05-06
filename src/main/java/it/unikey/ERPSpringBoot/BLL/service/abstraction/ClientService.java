package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.ClientRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ClientResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Client;

import java.util.List;

public interface ClientService {

    List<ClientResponseDto> clientsContactGreater10();
    List<Client> findAllById(Long id);
    List<Client> findAllByName(String name);
    List<Client> findAllByIVA(String Iva);
    void saveClient (ClientRequestDto clientRequestDto);
    ClientResponseDto findById (Long id);
}
