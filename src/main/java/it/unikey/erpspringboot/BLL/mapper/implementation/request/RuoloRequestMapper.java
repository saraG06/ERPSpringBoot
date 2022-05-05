package it.unikey.erpspringboot.BLL.mapper.implementation.request;

import it.unikey.erpspringboot.BLL.dto.Request.RuoloRequestDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspringboot.DAL.Entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloRequestMapper extends GenericRequestMapper<Ruolo, RuoloRequestDTO> {
}
