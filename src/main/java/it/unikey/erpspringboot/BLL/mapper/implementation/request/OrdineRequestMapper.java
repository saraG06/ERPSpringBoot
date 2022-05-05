package it.unikey.erpspringboot.BLL.mapper.implementation.request;

import it.unikey.erpspringboot.BLL.dto.Request.OrdineRequestDTO;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
