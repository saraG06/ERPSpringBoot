package it.unikey.erpspringboot.BLL.mapper.implementation.request;

import it.unikey.erpspringboot.BLL.dto.Request.AziendaRequestDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspringboot.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
