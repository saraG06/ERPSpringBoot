package BLL.mapper.implementazioni.request;

import BLL.dto.request.OperatoreRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import BLL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
