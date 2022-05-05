package BLL.mapper.implementation.request;

import BLL.dto.Request.RuoloRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloRequestMapper extends GenericRequestMapper<Ruolo, RuoloRequestDTO> {
}
