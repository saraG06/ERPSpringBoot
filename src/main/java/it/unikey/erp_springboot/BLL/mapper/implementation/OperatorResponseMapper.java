package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.OperatorResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Operator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatorResponseMapper extends GenericResponseMapper<Operator, OperatorResponseDTO> {
}
