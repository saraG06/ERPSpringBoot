package it.unikey.erpSpringBootTest.BLL.mapper.implementation.request;

import it.unikey.erpSpringBootTest.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
