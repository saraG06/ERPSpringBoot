package it.unikey.erpSpringBootTest.BLL.mapper.implementation.request;

import it.unikey.erpSpringBootTest.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
