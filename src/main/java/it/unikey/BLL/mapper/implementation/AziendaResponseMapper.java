package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.mapper.dto.response.AziendaResponseDTO;
import it.unikey.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
