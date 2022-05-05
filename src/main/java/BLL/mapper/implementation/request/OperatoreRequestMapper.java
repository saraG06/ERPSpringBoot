package BLL.mapper.implementation.request;

import BLL.dto.Request.OperatoreRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
