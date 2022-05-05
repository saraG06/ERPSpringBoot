package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Collaborator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratorResponseMapper extends GenericResponseMapper<Collaborator, CollaboratorResponseDTO> {
}
