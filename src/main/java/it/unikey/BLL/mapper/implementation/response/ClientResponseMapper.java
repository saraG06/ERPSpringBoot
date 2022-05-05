package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.dto.response.ClientResponseDTO;
import it.unikey.DAL.Entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientResponseMapper extends GenericResponseMapper<Client, ClientResponseDTO> {
}
