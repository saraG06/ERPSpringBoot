package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
