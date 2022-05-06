package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.response.ResourceResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface ResourceResponseMapper extends GenericResponseMapper<Resource, ResourceResponseDto> {
}
