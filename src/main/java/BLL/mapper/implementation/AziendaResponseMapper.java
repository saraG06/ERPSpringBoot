package BLL.mapper.implementation;
import DAL.Entity.Azienda;
import BLL.dto.response.AziendaResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
