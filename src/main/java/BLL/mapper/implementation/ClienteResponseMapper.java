package BLL.mapper.implementation;
import DAL.Entity.Cliente;
import BLL.dto.response.ClienteResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
