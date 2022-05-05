package it.unikey.erpspringboot.BLL.mapper.implementation.response;

import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspringboot.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
