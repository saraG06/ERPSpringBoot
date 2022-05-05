package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.RisorsaRequestDTO;
import DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
