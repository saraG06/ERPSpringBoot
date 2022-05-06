package BLL.mapper.implementazioni.request;

import BLL.dto.request.AziendaRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import BLL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
