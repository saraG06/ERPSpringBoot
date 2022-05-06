package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.ContactRequestDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface ContactRequestMapper extends GenericRequestMapper<ContactRequestDto, Contact> {
}
