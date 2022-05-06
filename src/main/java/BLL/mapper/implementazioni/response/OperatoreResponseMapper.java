package BLL.mapper.implementazioni.response;

import BLL.dto.response.OperatoreResponseDTO;
import BLL.mapper.astratti.GenericResponseMapper;
import BLL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
