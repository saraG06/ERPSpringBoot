package it.unikey.erpspring.BLL.mapper.implementazioni.response;

import it.unikey.erpspring.BLL.dto.response.CollaboratoreResponseDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericResponseMapper;
import it.unikey.erpspring.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
