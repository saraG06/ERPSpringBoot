package it.unikey.erpspring.BLL.mapper.implementation.request;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Collaborator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorRequestMapper extends GenericRequestMapper<CollaboratorRequestDTO, Collaborator> {
}
