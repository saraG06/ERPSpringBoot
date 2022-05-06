package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.RisorsaResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorsa, RisorsaResponseDTO> {
}
