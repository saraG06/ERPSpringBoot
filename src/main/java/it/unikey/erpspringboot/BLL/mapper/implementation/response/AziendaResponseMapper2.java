package it.unikey.erpspringboot.BLL.mapper.implementation.response;

import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspringboot.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper2 extends GenericResponseMapper<AziendaResponseDTO,Azienda> {
}
