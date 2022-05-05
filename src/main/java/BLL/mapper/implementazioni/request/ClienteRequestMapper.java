package BLL.mapper.implementazioni.request;

import BLL.dto.request.ClienteRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper extends GenericRequestMapper<Cliente, ClienteRequestDTO> {
}
