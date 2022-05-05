package BLL.mapper.implementation.response;

import BLL.dto.Response.FatturaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
