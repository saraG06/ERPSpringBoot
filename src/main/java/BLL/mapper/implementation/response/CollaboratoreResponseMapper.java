package BLL.mapper.implementation.response;

import BLL.dto.Response.CollaboratoreResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
