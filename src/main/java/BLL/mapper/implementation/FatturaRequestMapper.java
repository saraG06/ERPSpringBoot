package BLL.mapper.implementation;
import BLL.dto.request.FatturaRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
