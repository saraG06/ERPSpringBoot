package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericReponseMapper;
import it.unikey.erpspring.DAL.entity.Collaborator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorResponseMapper extends GenericReponseMapper<Collaborator, CollaboratorResponseDTO> {
}
