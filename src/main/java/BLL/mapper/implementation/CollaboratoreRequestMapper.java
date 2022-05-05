package BLL.mapper.implementation;
import DAL.Entity.persone.Collaboratore;
import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
