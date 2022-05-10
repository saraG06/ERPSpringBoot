package it.unikey.erpspring.BLL.mapper.implementation.response;

import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactResponseMapper extends GenericResponseMapper<Contact, ContactResponseDTO> {
}
