package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
