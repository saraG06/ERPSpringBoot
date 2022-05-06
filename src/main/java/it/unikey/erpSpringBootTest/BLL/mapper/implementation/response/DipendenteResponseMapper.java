package it.unikey.erpSpringBootTest.BLL.mapper.implementation.response;

import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteResponseMapper extends GenericResponseMapper<Dipendente, DipendenteResponseDTO> {
}
