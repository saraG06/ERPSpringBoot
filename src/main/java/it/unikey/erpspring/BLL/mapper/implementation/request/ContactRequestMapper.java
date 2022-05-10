package it.unikey.erpspring.BLL.mapper.implementation.request;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactRequestMapper extends GenericRequestMapper<ContactRequestDTO, Contact> {
}
