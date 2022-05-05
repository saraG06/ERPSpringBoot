package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.DAL.Entity.Collaborator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorResponseMapper extends GenericResponseMapper<Collaborator, CollaboratorResponseDTO> {
}
