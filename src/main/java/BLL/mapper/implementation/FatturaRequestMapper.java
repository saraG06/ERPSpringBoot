package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.FatturaRequestDTO;
import DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
