package BLL.mapper.implementazioni.response;

import BLL.dto.response.AziendaResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
