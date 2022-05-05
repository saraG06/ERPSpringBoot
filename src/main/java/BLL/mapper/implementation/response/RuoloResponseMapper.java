package BLL.mapper.implementation.response;

import BLL.dto.Response.RuoloResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloResponseMapper extends GenericResponseMapper<Ruolo, RuoloResponseDTO> {
}
