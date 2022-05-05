package BLL.mapper.implementazioni.request;

import BLL.dto.response.OrdineResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
