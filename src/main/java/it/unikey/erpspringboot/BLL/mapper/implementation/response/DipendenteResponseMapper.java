package it.unikey.erpspringboot.BLL.mapper.implementation.response;

import it.unikey.erpspringboot.BLL.dto.Response.DipendenteResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspringboot.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteResponseMapper extends GenericResponseMapper<Dipendente, DipendenteResponseDTO> {
}
