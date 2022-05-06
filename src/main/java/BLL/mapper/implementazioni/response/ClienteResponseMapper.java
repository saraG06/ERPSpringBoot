package BLL.mapper.implementazioni.response;

import BLL.dto.response.ClienteResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import BLL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
