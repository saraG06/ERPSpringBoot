package BLL.mapper.implementation;
import BLL.dto.response.OrdineResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
