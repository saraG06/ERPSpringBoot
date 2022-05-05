package BLL.mapper.implementation;
import BLL.dto.response.RisorsaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Enum.Risorse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorse, RisorsaResponseDTO> {
}
