package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.OperatoreRequestDTO;
import DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
