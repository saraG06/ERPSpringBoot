package it.unikey.erpspringboot.BLL.mapper.implementation.response;

import it.unikey.erpspringboot.BLL.dto.Response.CollaboratoreResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspringboot.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
