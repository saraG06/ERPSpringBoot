package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.ContattoResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
