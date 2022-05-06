package BLL.mapper.implementazioni.response;

import BLL.dto.response.DipendenteResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import BLL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteResponseMapper extends GenericResponseMapper<Dipendente, DipendenteResponseDTO> {
}
