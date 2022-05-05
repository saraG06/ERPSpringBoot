package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.CollaboratoreRequestDTO;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
