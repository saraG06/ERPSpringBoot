package BLL.mapper.implementation.response;

import BLL.dto.Response.OrdineResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
