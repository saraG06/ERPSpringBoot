package BLL.mapper.implementation.response;

import BLL.dto.Response.DipendenteResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteResponseMapper extends GenericResponseMapper<Dipendente, DipendenteResponseDTO> {
}
