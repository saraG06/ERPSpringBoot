package BLL.mapper.implementation.request;

import BLL.dto.Request.CollaboratoreRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
