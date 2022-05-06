package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
