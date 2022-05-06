package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.BLL.mapper.dto.request.OrdineRequestDTO;
import it.unikey.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
