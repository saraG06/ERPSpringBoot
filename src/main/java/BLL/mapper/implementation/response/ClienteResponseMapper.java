package BLL.mapper.implementation.response;

import BLL.dto.Response.ClienteResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
