package it.unikey.erpspring.BLL.mapper.implementazioni.response;

import it.unikey.erpspring.BLL.mapper.astratti.GenericResponseMapper;
import it.unikey.erpspring.BLL.dto.response.ContattoResponseDTO;
import it.unikey.erpspring.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
