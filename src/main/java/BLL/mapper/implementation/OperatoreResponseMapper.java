package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.OperatoreResponseDTO;
import DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
