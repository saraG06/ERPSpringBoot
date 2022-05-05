package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.AziendaResponseDTO;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
