package it.unikey.erpSpringBootTest.BLL.mapper.implementation.request;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
