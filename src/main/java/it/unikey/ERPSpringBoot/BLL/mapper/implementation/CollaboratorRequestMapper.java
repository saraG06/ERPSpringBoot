package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.CollaboratorRequestDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Collaborator;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface CollaboratorRequestMapper extends GenericRequestMapper<CollaboratorRequestDto, Collaborator> {
}
