package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.CollaboratoreResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
