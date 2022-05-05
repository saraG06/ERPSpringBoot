package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.RisorsaResponseDTO;
import DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorsa, RisorsaResponseDTO> {
}
