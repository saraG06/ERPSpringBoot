package BLL.mapper.implementation.response;

import BLL.dto.Response.OperatoreResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
