package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.DAL.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface ClientService{

    List<ClientResponseDTO> findClientsWithMoreThan10Contacts();
    List<ClientResponseDTO> clientsConctactGreater10();

    void saveClient (ClientRequestDTO clientRequestDTO);

    ClientResponseDTO getById(Long id) throws EntityNotFoundException;
}
