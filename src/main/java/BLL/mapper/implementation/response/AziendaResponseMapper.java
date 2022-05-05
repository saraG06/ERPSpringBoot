package BLL.mapper.implementation.response;

import BLL.dto.Response.AziendaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
