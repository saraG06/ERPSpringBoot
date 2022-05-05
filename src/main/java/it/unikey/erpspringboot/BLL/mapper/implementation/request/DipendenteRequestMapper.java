package it.unikey.erpspringboot.BLL.mapper.implementation.request;

import it.unikey.erpspringboot.BLL.dto.Request.DipendenteRequestDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspringboot.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
