package BLL.mapper.implementation.request;

import BLL.dto.Request.AziendaRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
