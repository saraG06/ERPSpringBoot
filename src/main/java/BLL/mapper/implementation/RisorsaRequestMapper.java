package BLL.mapper.implementation;
import DAL.Entity.Enum.Risorse;
import BLL.dto.request.RisorsaRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorse, RisorsaRequestDTO> {
}
