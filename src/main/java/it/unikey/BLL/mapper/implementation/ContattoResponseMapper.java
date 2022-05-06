package it.unikey.BLL.mapper.implementation;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.mapper.dto.response.ContattoResponseDTO;
import it.unikey.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
