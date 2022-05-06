package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
