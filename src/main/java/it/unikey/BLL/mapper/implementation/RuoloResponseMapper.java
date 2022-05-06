package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.mapper.dto.response.RuoloResponseDTO;
import it.unikey.DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloResponseMapper extends GenericResponseMapper<Ruolo, RuoloResponseDTO> {
}
