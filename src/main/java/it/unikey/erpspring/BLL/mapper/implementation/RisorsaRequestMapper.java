package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
