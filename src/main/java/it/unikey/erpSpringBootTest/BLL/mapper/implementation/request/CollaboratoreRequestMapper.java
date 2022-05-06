package it.unikey.erpSpringBootTest.BLL.mapper.implementation.request;

import it.unikey.erpSpringBootTest.BLL.dto.request.CollaboratoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
