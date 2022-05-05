package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.ContactRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactRequestMapper extends GenericRequestMapper<Contact, ContactRequestDTO> {
}
