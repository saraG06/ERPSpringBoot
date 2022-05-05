package BLL.mapper.implementation;
import BLL.dto.request.ClienteRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper extends GenericRequestMapper<Cliente, ClienteRequestDTO> {
}
