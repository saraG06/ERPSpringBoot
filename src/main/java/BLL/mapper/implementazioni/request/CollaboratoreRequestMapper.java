package BLL.mapper.implementazioni.request;

import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
