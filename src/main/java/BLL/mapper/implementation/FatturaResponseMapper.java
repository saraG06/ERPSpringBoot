package BLL.mapper.implementation;
import BLL.dto.response.FatturaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
