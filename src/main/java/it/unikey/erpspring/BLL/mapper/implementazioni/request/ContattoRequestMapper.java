package it.unikey.erpspring.BLL.mapper.implementazioni.request;

import it.unikey.erpspring.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericRequestMapper;
import it.unikey.erpspring.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
