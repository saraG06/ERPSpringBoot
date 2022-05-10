package it.unikey.erpspring.BLL.mapper.implementation.response;

import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Collaborator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorResponseMapper extends GenericResponseMapper<Collaborator, CollaboratorResponseDTO> {
}
