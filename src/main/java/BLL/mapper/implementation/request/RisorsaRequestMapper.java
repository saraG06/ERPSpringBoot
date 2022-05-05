package BLL.mapper.implementation.request;

import BLL.dto.Request.RisorsaRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
