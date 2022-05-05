package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.OperatorRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Operator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatorRequestMapper extends GenericRequestMapper<Operator, OperatorRequestDTO> {
}
