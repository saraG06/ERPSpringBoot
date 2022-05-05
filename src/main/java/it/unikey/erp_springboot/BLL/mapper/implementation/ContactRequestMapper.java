package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erp_springboot.DAL.Entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactRequestMapper extends GenericRequestMapper<Contact, ContactRequestDTO> {
}
