package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.BLL.mapper.dto.request.RuoloRequestDTO;
import it.unikey.DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloRequestMapper extends GenericRequestMapper<Ruolo, RuoloRequestDTO> {
}
