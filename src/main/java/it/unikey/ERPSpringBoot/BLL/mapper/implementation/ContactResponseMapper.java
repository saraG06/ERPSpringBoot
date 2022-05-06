package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.response.ContactResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface ContactResponseMapper extends GenericResponseMapper<Contact, ContactResponseDto> {
}
