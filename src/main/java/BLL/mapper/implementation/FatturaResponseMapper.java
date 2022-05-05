package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.FatturaResponseDTO;
import DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
