package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.dto.response.OperatorResponseDTO;
import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.DAL.Entity.Operator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatorResponseMapper extends GenericResponseMapper<Operator, OperatorResponseDTO> {
}
