package it.unikey.erpSpringBootTest.BLL.mapper.implementation.request;

import it.unikey.erpSpringBootTest.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
