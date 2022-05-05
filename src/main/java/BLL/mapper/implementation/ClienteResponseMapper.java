package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.ClienteResponseDTO;
import DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
