package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.OrdineResponseDTO;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
