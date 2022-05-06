package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.BLL.mapper.dto.request.ClienteRequestDTO;
import it.unikey.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper extends GenericRequestMapper<Cliente, ClienteRequestDTO> {
}
