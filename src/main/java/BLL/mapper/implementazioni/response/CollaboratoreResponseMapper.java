package BLL.mapper.implementazioni.response;

import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
