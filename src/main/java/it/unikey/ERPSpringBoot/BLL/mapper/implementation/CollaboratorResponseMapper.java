package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.response.CollaboratorResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Collaborator;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface CollaboratorResponseMapper extends GenericResponseMapper<Collaborator, CollaboratorResponseDto> {
}
