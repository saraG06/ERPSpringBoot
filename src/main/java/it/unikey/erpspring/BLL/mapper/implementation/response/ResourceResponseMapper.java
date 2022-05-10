package it.unikey.erpspring.BLL.mapper.implementation.response;

import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Resource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResourceResponseMapper extends GenericResponseMapper<Resource, ResourceResponseDTO> {
}
