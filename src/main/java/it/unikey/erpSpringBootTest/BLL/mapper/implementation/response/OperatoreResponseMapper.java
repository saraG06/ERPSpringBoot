package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.OperatoreResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
