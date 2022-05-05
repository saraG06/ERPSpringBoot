package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.dto.response.ContactResponseDTO;
import it.unikey.DAL.Entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactResponseMapper extends GenericResponseMapper<Contact, ContactResponseDTO> {
}
