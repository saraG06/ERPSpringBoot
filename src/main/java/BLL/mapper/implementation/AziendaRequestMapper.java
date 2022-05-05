package BLL.mapper.implementation;

import DAL.Entity.Azienda;
import BLL.dto.request.AziendaRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
