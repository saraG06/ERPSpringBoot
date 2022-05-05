package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.AziendaRequestDTO;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
