package BLL.mapper.implementazioni.request;

import BLL.dto.response.OrdineResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import BLL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
