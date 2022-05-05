package BLL.mapper.implementation;
import DAL.Entity.persone.Collaboratore;
import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
