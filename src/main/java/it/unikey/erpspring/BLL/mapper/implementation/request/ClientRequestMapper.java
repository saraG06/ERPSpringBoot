package it.unikey.erpspring.BLL.mapper.implementation.request;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientRequestMapper extends GenericRequestMapper<ClientRequestDTO, Client> {
}
