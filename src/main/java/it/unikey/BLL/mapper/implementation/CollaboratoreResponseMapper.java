package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.mapper.dto.response.CollaboratoreResponseDTO;
import it.unikey.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
