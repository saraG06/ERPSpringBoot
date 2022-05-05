package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.RuoloRequestDTO;
import DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloRequestMapper extends GenericRequestMapper<Ruolo, RuoloRequestDTO> {
}
