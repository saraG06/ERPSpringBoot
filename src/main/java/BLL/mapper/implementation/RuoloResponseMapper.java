package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.RuoloResponseDTO;
import DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloResponseMapper extends GenericResponseMapper<Ruolo, RuoloResponseDTO> {
}
