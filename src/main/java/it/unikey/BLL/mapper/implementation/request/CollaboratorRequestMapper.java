package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorRequestMapper extends GenericRequestMapper<Client, ClientRequestDTO> {
}
