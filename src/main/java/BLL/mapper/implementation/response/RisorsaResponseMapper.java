package BLL.mapper.implementation.response;

import BLL.dto.Response.RisorsaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorsa, RisorsaResponseDTO> {
}
