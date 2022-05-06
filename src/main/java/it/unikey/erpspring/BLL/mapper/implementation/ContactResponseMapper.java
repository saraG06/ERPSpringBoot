package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericReponseMapper;
import it.unikey.erpspring.DAL.entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactResponseMapper extends GenericReponseMapper<Contact, ContactResponseDTO> {
}
