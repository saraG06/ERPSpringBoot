package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.BLL.mapper.dto.request.CollaboratoreRequestDTO;
import it.unikey.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
