package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.CollaboratoreResponseDTO;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
