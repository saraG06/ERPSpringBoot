package it.unikey.erpspringboot.BLL.mapper.implementation.response;

import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
